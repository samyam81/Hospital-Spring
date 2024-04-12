package com.hospital.hospital.Repo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.hospital.hospital.Entity.Check;

@Component
public class CheckRepo {
    
    private final JdbcTemplate jdbcTemplate;

    public CheckRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void check(Check check) {
        String sql = "SELECT pass FROM check WHERE Eno = ?";
        try {
            String dbPassword = jdbcTemplate.queryForObject(sql, new Object[]{check.getEno()}, String.class);
            if (dbPassword != null && dbPassword.equals(check.getPass())) {
                System.out.println("Welcome");
            } else {
                System.out.println("Incorrect password");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
