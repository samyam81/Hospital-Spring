package com.hospital.hospital.Repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.hospital.hospital.Entity.Treatment;

@Repository
public class TreatmentRepo {

    @Autowired
    private JdbcTemplate template;

    public void save(Treatment t1) {
        String sql = "INSERT INTO Treatments (id, Date) VALUES (?, ?)";
        int rows = template.update(sql, t1.getTreatment_Id(), t1.getDate());
        System.out.println("Rows Affected: " + rows);
    }

    public List<Treatment> findAll() {
        String sql = "SELECT * FROM treatments";
        List<Treatment> treatments = template.query(sql, new TreatmentRowMapper());
        return treatments;
    }

    private class TreatmentRowMapper implements RowMapper<Treatment> {
        @SuppressWarnings("unused")
        @Override
        public Treatment mapRow(@SuppressWarnings("null") ResultSet rs, int rowNum) throws SQLException {
            Treatment treatment = new Treatment();
            treatment.setTreatment_Id(rs.getInt("id"));        
            String dateString = rs.getString("Date");
            Date date;
            try {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); // Adjust format as per your database date format
                date = formatter.parse(dateString);
            } catch (ParseException e) {
                throw new SQLException("Error parsing date: " + dateString, e);
            }
            treatment.setDate("date");
            return treatment;
        }
    }
}
