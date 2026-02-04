package com.akshay.nearbysense.controller;

import com.akshay.nearbysense.dto.PlaceResponseDto;
import com.akshay.nearbysense.service.PlaceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/places")
public class PlaceController {

    private final PlaceService placeService;

    public PlaceController(PlaceService placeService){
        this.placeService=placeService;
    }

    @GetMapping("/search")
    public PlaceResponseDto searchPlaces(
            @RequestParam String keyword,
            @RequestParam double latitude,
            @RequestParam double longitude
            )
    {
        return placeService.searchPlaces(keyword, latitude, longitude);
    }


}
