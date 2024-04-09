package com.hospital.hospital.Entity;

import org.springframework.stereotype.Component;

@Component
public class Treatment {
    private int Treatment_Id;
    private String date;

    public int getTreatment_Id() {
        return Treatment_Id;
    }
    public void setTreatment_Id(int treatment_Id) {
        Treatment_Id = treatment_Id;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    
    @Override
    public String toString() {
        return "Treatment [Treatment_Id=" + Treatment_Id + ", date=" + date + "]";
    }

}
