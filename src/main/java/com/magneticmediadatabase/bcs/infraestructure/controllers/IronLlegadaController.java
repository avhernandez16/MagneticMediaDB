package com.magneticmediadatabase.bcs.infraestructure.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IronLlegadaController {

    @GetMapping(value ="/")
    public String primerPrueba(){
        return "holaa";
    }
}
