package com.hospital.hospital.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity

@Table(name = "Checks")
public class Check {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Eno;
    private String pass;
}
