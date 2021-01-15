package com.bridgelabz.awsproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class AWSResponse {
	
	@GetMapping("/aws")
    public String greeting() {

        return "Welcome to aws deployement";
    }

}
