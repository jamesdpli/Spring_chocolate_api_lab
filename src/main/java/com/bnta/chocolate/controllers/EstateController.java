package com.bnta.chocolate.controllers;

import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("estates")
public class EstateController {

    @Autowired
    EstateRepository estateRepository;

    @GetMapping
    public List<Estate> getAllEstates(){
        return estateRepository.findAll();
    }

}
