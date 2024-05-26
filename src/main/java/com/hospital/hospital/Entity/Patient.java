package com.hospital.hospital.Entity;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Component
public class Patient {
    private int PatientID;
    private String name;
    private String address;
}
