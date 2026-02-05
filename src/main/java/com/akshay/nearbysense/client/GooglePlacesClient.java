package com.akshay.nearbysense.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GooglePlacesClient {

    private final RestTemplate restTemplate;
    private final String apiKey;

    public GooglePlacesClient(
            RestTemplate restTemplate,
            @Value("${google.api.key}") String apiKey
    ) {
        this.restTemplate = restTemplate;
        this.apiKey = apiKey;
    }
}
