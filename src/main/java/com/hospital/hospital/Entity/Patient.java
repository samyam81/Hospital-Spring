package com.hospital.hospital.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity

@Table(name = "Patients")
public class Patient {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int PatientID;
    private String name;
    private String address;
}
