package com.luv2code.cruddemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "professionalDetails")
public class ProfessionalDetails {

    @Id
    private int id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "designation")
     private String designation;

    @Column(name = "salary")
     private double salary;

}
