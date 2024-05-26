package com.hospital.hospital.Entity;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Component
public class Treatment {
    private int Treatment_Id;
    private String date;
}
