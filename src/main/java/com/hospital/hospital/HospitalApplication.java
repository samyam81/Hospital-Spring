package com.hospital.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hospital.hospital.Entity.*;
// import com.hospital.hospital.Entity.Appointment;
// import com.hospital.hospital.Entity.Doctor;
// import com.hospital.hospital.Entity.Nurse;
// import com.hospital.hospital.Entity.Patient;
// import com.hospital.hospital.Entity.Treatment;

@SpringBootApplication
public class HospitalApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(HospitalApplication.class, args);

		Patient p1=context.getBean(Patient.class);
		p1.setName("John Doe");
		p1.setPatientID(1);
		p1.setAddress("789 Oak Street");

		Doctor d1= context.getBean(Doctor.class);
		d1.setDoctor_id(1);
		d1.setName("Dr. Adams");

		Nurse n1= context.getBean(Nurse.class);
		n1.setNurse_id(1);
		n1.setName("Nurse Smith");

		Treatment t1=context.getBean(Treatment.class);
		t1.setTreatment_Id(1);
		t1.setDate("2024-04-10");

		Appointment a1=context.getBean(Appointment.class);
		a1.setAppointment_ID(1);

	}
}
