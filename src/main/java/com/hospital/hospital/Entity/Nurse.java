package com.hospital.hospital.Entity;

import org.springframework.stereotype.Component;

@Component
public class Nurse {
    private int  nurse_id;
    private String name;
    
    @Override
    public String toString() {
        return "Nurse [nurse_id=" + nurse_id + ", name=" + name + "]";
    }

    public int getNurse_id() {
        return nurse_id;
    }

    public void setNurse_id(int nurse_id) {
        this.nurse_id = nurse_id;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
}
