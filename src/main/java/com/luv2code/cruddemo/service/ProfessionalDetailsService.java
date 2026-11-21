package com.luv2code.cruddemo.service;

import com.luv2code.cruddemo.Exceptions.ProfessionalDetailsNotFoundException;
import com.luv2code.cruddemo.entity.ProfessionalDetails;
import com.luv2code.cruddemo.repository.ProfessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfessionalDetailsService {

    private final ProfessionRepository repository;

    public ProfessionalDetails professionalDetails(Integer id){

        var professionalDetails = repository.findById (id)
                .orElseThrow(()-> {
                    throw new ProfessionalDetailsNotFoundException ( "Professional details not found with id: " + id + " please check with id" );
                });
        return professionalDetails;
    }
}
