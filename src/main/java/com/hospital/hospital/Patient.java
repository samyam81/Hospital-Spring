package com.hospital.hospital;

import org.springframework.stereotype.Component;

@Component
public class Patient {
    private int PatientID;
    private String name;
    private String address;
    
    public int getPatientID() {
        return PatientID;
    }
    public void setPatientID(int patientID) {
        PatientID = patientID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
}
