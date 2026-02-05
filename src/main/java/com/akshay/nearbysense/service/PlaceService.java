package com.akshay.nearbysense.service;

import com.akshay.nearbysense.client.GooglePlacesClient;
import com.akshay.nearbysense.dto.PlaceResponseDto;
import com.akshay.nearbysense.dto.PlaceResultDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceService {
 private final GooglePlacesClient googlePlacesClient;

 public PlaceService(GooglePlacesClient googlePlacesClient){
      this.googlePlacesClient=googlePlacesClient;
  }

    public PlaceResponseDto searchPlaces(String keyword, double latitude, double longitude) {

        List<PlaceResultDto> results = List.of(
                new PlaceResultDto("Sample Cafe", "Unknown Street", 4.2)
        );

        return new PlaceResponseDto(keyword, results);
    }
}
