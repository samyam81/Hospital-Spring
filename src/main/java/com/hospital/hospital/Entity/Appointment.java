package com.hospital.hospital.Entity;

public class Appointment {
    
    private int Appointment_ID;

    public int getAppointment_ID() {
        return Appointment_ID;
    }

    public void setAppointment_ID(int appointment_ID) {
        Appointment_ID = appointment_ID;
    }

    @Override
    public String toString() {
        return "Appointment [Appointment_ID=" + Appointment_ID + "]";
    }
    
}
