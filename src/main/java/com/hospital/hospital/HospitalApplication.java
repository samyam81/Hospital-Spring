package com.hospital.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

import com.hospital.hospital.Entity.*;
import com.hospital.hospital.Repo.*;

@SpringBootApplication
public class HospitalApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(HospitalApplication.class, args);

        // Autowire repositories
        PatientRepo patientRepo = context.getBean(PatientRepo.class);
        DoctorRepo doctorRepo = context.getBean(DoctorRepo.class);
        NurseRepo nurseRepo = context.getBean(NurseRepo.class);
        TreatmentRepo treatmentRepo = context.getBean(TreatmentRepo.class);
        AppointmentRepo appointmentRepo = context.getBean(AppointmentRepo.class);

        // Save entities
        Patient p1 = new Patient();
        p1.setName("John Doe");
        p1.setPatientID(1);
        p1.setAddress("789 Oak Street");
        patientRepo.save(p1);

        Doctor d1 = new Doctor();
        d1.setDoctor_id(1);
        d1.setName("Dr. Adams");
        doctorRepo.save(d1);

        Nurse n1 = new Nurse();
        n1.setNurse_id(1);
        n1.setName("Nurse Smith");
        nurseRepo.save(n1);

        Treatment t1 = new Treatment();
        t1.setTreatment_Id(1);
        t1.setDate("2024-04-10");
        treatmentRepo.save(t1);

        Appointment a1 = new Appointment();
        a1.setAppointment_ID(1);
        appointmentRepo.save(a1);

        // Fetch all records
        List<Patient> patients = patientRepo.findAll();
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println(patient);
        }

        List<Doctor> doctors = doctorRepo.findAll();
        System.out.println("\nDoctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }

        List<Nurse> nurses = nurseRepo.findAll();
        System.out.println("\nNurses:");
        for (Nurse nurse : nurses) {
            System.out.println(nurse);
        }

        List<Treatment> treatments = treatmentRepo.findAll();
        System.out.println("\nTreatments:");
        for (Treatment treatment : treatments) {
            System.out.println(treatment);
        }

        List<Appointment> appointments = appointmentRepo.findAll();
        System.out.println("\nAppointments:");
        for (Appointment appointment : appointments) {
            System.out.println(appointment);
        }

        new HospitalApplication2();
    }
}
