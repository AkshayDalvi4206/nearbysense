package com.akshay.nearbysense.controller;

import com.akshay.nearbysense.dto.PlaceResponseDto;
import com.akshay.nearbysense.dto.PlaceResultDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/places")
public class PlaceController {

    @GetMapping("/search")
    public PlaceResponseDto searchPlaces(
            @RequestParam String keyword,
            @RequestParam double latitude,
            @RequestParam double longitude
    ) {
        List<PlaceResultDto> dummyResults = List.of(
                new PlaceResultDto("Sample Cafe", "Unknown Street", 4.2)
        );

        return new PlaceResponseDto(keyword, dummyResults);
    }


}
