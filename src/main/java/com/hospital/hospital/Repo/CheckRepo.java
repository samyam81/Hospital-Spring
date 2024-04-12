package com.hospital.hospital.Repo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class CheckRepo {
    
    private final JdbcTemplate jdbcTemplate;

    public CheckRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void check(int eno, String pass) {
        String sql = "SELECT pass FROM check WHERE Eno = ?";
        try {
            String dbPassword = jdbcTemplate.queryForObject(sql, String.class, eno);
            if (dbPassword != null && dbPassword.equals(pass)) {
                System.out.println("Welcome");
            } else {
                System.out.println("Incorrect password");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
