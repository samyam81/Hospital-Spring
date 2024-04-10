package com.hospital.hospital.Repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.hospital.hospital.Entity.Patient;

@Repository
public class PatientRepo {
    
    @Autowired
    private JdbcTemplate template;

    public void save(Patient p1){
        String sql = "INSERT INTO Patient (id, name, Address) VALUES (?, ?, ?)";
        int rows = template.update(sql, p1.getPatientID(), p1.getName(), p1.getAddress());
        System.out.println("Rows Affected: " + rows);    
    }

    public List<Patient> findAll(){
        String sql = "SELECT * FROM p1";
        List<Patient> patients = template.query(sql, new PatientRowMapper());
        return patients;
    }

    private class PatientRowMapper implements RowMapper<Patient> {
        @Override
        public Patient mapRow(ResultSet rs, int rowNum) throws SQLException{
            Patient p1 = new Patient();
            p1.setPatientID(rs.getInt("id"));
            p1.setName(rs.getString("name"));
            p1.setAddress(rs.getString("Address"));
            return p1;
        }
    }
}
