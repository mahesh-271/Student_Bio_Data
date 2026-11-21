package com.luv2code.cruddemo.repository;

import com.luv2code.cruddemo.entity.ProfessionalDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessionRepository extends JpaRepository<ProfessionalDetails , Integer> {
}
