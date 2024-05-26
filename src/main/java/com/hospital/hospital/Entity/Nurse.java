package com.hospital.hospital.Entity;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Component
public class Nurse {
    private int  nurse_id;
    private String name;
}
