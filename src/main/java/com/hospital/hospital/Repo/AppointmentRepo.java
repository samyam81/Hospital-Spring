package com.hospital.hospital.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hospital.hospital.Entity.Appointment;

@Repository
public class AppointmentRepo {
    @Autowired
    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void save(Appointment a1){
        String sql="Insert into Appointment(id)& values(?)";
        int rows=template.update(sql,a1.getAppointment_ID());
        System.out.println("Rows Affected:::"+rows);   
    }
}
