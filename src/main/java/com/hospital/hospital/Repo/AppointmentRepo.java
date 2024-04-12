package com.hospital.hospital.Repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.hospital.hospital.Entity.Appointment;

@Repository
public class AppointmentRepo {
    
    @Autowired
    private JdbcTemplate template;

    public void save(Appointment a1) {
        String sql = "INSERT INTO Appointment (id) VALUES (?)";
        int rows = template.update(sql, a1.getAppointment_ID());
        System.out.println("Rows Affected: " + rows);
    }

    public List<Appointment> findAll() {
        String sql = "SELECT * FROM Appointment";
        List<Appointment> appointments = template.query(sql, new AppointmentRowMapper());
        return appointments;
    }

    private class AppointmentRowMapper implements RowMapper<Appointment> {
        @Override
        public Appointment mapRow(@SuppressWarnings("null") ResultSet rs, int rowNum) throws SQLException {
            Appointment appointment = new Appointment();
            appointment.setAppointment_ID(rs.getInt("id"));
            // Set other properties of the Appointment object if necessary
            return appointment;
        }
    }
}
