package com.hospital.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hospital.hospital.Entity.Check;
import com.hospital.hospital.Repo.CheckRepo;

public class HospitalApplication2 {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(HospitalApplication.class, args);
        CheckRepo Chr=context.getBean(CheckRepo.class);
        
        Check ch1=new Check();
        ch1.setEno(1);
        ch1.setPass("0011");
        Chr.check(ch1);

    }
}
