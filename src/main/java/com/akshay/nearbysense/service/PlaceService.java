package com.akshay.nearbysense.service;

import com.akshay.nearbysense.client.GooglePlacesClient;
import com.akshay.nearbysense.dto.PlaceResponseDto;
import com.akshay.nearbysense.dto.PlaceResultDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class PlaceService {

    private final GooglePlacesClient googlePlacesClient;

    public PlaceService(GooglePlacesClient googlePlacesClient) {
        this.googlePlacesClient = googlePlacesClient;
    }

    @SuppressWarnings("unchecked")
    public PlaceResponseDto searchPlaces(String keyword, double latitude, double longitude) {

        Map<String, Object> response =
                googlePlacesClient.searchNearbyPlaces(latitude, longitude, keyword);

        List<Map<String, Object>> results =
                (List<Map<String, Object>>) response.get("results");

        List<PlaceResultDto> places = new ArrayList<>();

        if (results != null) {
            for (Map<String, Object> place : results) {
                String name = (String) place.get("name");
                String address = (String) place.get("vicinity");
                Double rating = (Double) place.getOrDefault("rating", 0.0);

                places.add(new PlaceResultDto(name, address, rating));
            }
        }
        String status = (String) response.get("status");
        System.out.println("Google Places status: " + status);

        return new PlaceResponseDto(keyword, places);
    }
}
