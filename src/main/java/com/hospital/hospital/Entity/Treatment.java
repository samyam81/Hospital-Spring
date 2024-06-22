package com.hospital.hospital.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Entity

@Table(name = "Treatments")
public class Treatment {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Treatment_Id;
    private String date;
}
