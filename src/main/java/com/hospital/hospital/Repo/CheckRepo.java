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

    public boolean check(Check check,int eno, String pass) {
        String sql = "SELECT pass FROM check WHERE eno = ?";
        try {
            String dbPassword = jdbcTemplate.queryForObject(sql, String.class, eno);
            return dbPassword != null && dbPassword.equals(pass);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}
