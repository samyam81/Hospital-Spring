package com.hospital.hospital.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DoctorRepo {
    
    @Autowired
    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    // Change this into Doctor class
    // public void save(Patient p1){
    //     String sql="Insert into Patient(id,name,Address)& values(?,?,?)";
    //     int rows=template.update(sql,p1.getPatientID(),p1.getName(),p1.getAddress());
    //     System.out.println("Rows Affected:::"+rows);    
    // }


}
