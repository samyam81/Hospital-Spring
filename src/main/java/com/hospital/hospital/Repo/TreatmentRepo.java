package com.hospital.hospital.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.hospital.hospital.Entity.Treatment;

public class TreatmentRepo {

    @Autowired
    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void save(Treatment t1){
        String sql="Insert into Treatment(id,Date)& values(?,?)";
        int rows=template.update(sql,t1.getTreatment_Id(),t1.getDate());
        System.out.println("Rows Affected:::"+rows);    
    }

}
