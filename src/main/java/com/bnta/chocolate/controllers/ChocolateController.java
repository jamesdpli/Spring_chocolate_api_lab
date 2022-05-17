package com.bnta.chocolate.controllers;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("chocolates")
public class ChocolateController {

    @Autowired
    ChocolateRepository chocolateRepository;

//  INDEX
    @GetMapping
    public List<Chocolate> getAllChocolates(){
        return chocolateRepository.findAll();
    }

//  SHOW
    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Chocolate>> getChocolateById(@PathVariable Long id){
        return new ResponseEntity<>(chocolateRepository.findById(id), HttpStatus.OK);
    }

//  POST
    @PostMapping
    public ResponseEntity<Chocolate> createNewChocolate(@RequestBody Chocolate newChocolate){
        chocolateRepository.save(newChocolate);
        return new ResponseEntity<>(newChocolate, HttpStatus.CREATED);
    }

}
