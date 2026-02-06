package com.akshay.nearbysense.client;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class GooglePlacesClient {

    @SuppressWarnings("unchecked")
    public Map<String, Object> searchNearbyPlaces(
            double latitude,
            double longitude,
            String keyword
    ) {
        // Simulated Google Places API response
        Map<String, Object> response = new HashMap<>();

        response.put("status", "OK");

        List<Map<String, Object>> results = List.of(
                Map.of(
                        "name", "Brew Corner Cafe",
                        "vicinity", "Main Street",
                        "rating", 4.3
                ),
                Map.of(
                        "name", "Urban Beans",
                        "vicinity", "Downtown Avenue",
                        "rating", 4.1
                ),
                Map.of(
                        "name", "Chill Brew House",
                        "vicinity", "Riverside Road",
                        "rating", 4.5
                )
        );

        response.put("results", results);

        return response;
    }
}
