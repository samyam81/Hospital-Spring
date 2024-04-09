package com.hospital.hospital;

import org.springframework.stereotype.Component;

@Component
public class Doctor {
    private int Doctor_id;
    private String name;

    public int getDoctor_id() {
        return Doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        Doctor_id = doctor_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Doctor [Doctor_id=" + Doctor_id + ", name=" + name + "]";
    }
    

}
