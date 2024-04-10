package com.hospital.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hospital.hospital.Entity.*;

import com.hospital.hospital.Repo.AppointmentRepo;
import com.hospital.hospital.Repo.DoctorRepo;
import com.hospital.hospital.Repo.NurseRepo;
import com.hospital.hospital.Repo.PatientRepo;
import com.hospital.hospital.Repo.TreatmentRepo;

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

        // Create entities
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
    }
}
