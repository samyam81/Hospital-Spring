CREATE TABLE Hospital (
    hospital_id INT PRIMARY KEY,
    name VARCHAR(100),
    address VARCHAR(255),
    number VARCHAR(20)
);

CREATE TABLE Patient (
    patient_id INT PRIMARY KEY,
    name VARCHAR(100),
    address VARCHAR(255)
);

CREATE TABLE Doctor (
    doctor_id INT PRIMARY KEY,
    name VARCHAR(100),
    hospital_id INT,
    FOREIGN KEY (hospital_id) REFERENCES Hospital(hospital_id)
);

CREATE TABLE Appointment (
    appointment_id INT PRIMARY KEY,
    date DATE,
    doctor_id INT,
    patient_id INT,
    FOREIGN KEY (doctor_id) REFERENCES Doctor(doctor_id),
    FOREIGN KEY (patient_id) REFERENCES Patient(patient_id)
);

CREATE TABLE Treatment (
    treatment_id INT PRIMARY KEY,
    date DATE,
    appointment_id INT,
    FOREIGN KEY (appointment_id) REFERENCES Appointment(appointment_id)
);

CREATE TABLE Nurse (
    nurse_id INT PRIMARY KEY,
    name VARCHAR(100),
    hospital_id INT,
    FOREIGN KEY (hospital_id) REFERENCES Hospital(hospital_id)
);
