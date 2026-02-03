package com.akshay.nearbysense.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/places")
public class PlaceController {

    @GetMapping("/search")
    public String SearchPlaces(){
        return "NearBySense Api is running";

    }
}
