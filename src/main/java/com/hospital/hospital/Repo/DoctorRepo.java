package com.hospital.hospital.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hospital.hospital.Doctor;

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
    public void save(Doctor d1){
        String sql="Insert into Doctor(id,name)& values(?,?)";
        int rows=template.update(sql,d1.getDoctor_id(),d1.getName());
        System.out.println("Rows Affected:::"+rows);    
    } //Done.


}
