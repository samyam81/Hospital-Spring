package com.hospital.hospital.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.hospital.hospital.Entity.Nurse;

@Component
public class NurseRepo {

    @Autowired
    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

     public void save(Nurse n1){
        String sql="Insert into Nurse(id,name)& values(?,?)";
        int rows=template.update(sql,n1.getNurse_id(),n1.getName());
        System.out.println("Rows Affected:::"+rows);    
    }
}
