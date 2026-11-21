package com.luv2code.cruddemo.controller;


import com.luv2code.cruddemo.entity.ProfessionalDetails;
import com.luv2code.cruddemo.service.ProfessionalDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProfessionalController {
    
    private final ProfessionalDetailsService service;

    @GetMapping("/profession/{id}")
    public ResponseEntity<ProfessionalDetails> professionalDetails(@PathVariable Integer id){
        return new  ResponseEntity(service.professionalDetails (id), HttpStatus.OK );
    }
}
