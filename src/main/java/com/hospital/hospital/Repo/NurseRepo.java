package com.hospital.hospital.Repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.hospital.hospital.Entity.Nurse;

@Component
public class NurseRepo {

    @Autowired
    private JdbcTemplate template;

    public void save(Nurse n1) {
        String sql = "INSERT INTO Nurse (id, name) VALUES (?, ?)";
        int rows = template.update(sql, n1.getNurse_id(), n1.getName());
        System.out.println("Rows Affected: " + rows);    
    }

    public List<Nurse> findAll() {
        String sql = "SELECT * FROM nurses";
        List<Nurse> nurses = template.query(sql, new NurseRowMapper());
        return nurses;
    }

    private class NurseRowMapper implements RowMapper<Nurse> {
        @Override
        public Nurse mapRow(ResultSet rs, int rowNum) throws SQLException {
            Nurse nurse = new Nurse();
            nurse.setNurse_id(rs.getInt("id"));
            nurse.setName(rs.getString("name"));
            return nurse;
        }
    }
}
