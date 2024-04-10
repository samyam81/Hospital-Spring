package com.hospital.hospital.Repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.hospital.hospital.Entity.Doctor;

@Repository
public class DoctorRepo {
    
    @Autowired
    private JdbcTemplate template;

    public void save(Doctor d1){
        String sql = "INSERT INTO Doctor (id, name) VALUES (?, ?)";
        int rows = template.update(sql, d1.getDoctor_id(), d1.getName());
        System.out.println("Rows Affected: " + rows);    
    }

    public List<Doctor> findAll(){
        String sql = "SELECT * FROM d1";
        List<Doctor> doctors = template.query(sql, new DoctorRowMapper());
        return doctors;
    }

    private class DoctorRowMapper implements RowMapper<Doctor> {
        @Override
        public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {
            Doctor d1 = new Doctor();
            d1.setDoctor_id(rs.getInt("id"));
            d1.setName(rs.getString("name"));
            return d1;
        }
    }
}
