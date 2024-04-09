package com.hospital.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

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

	}
}
