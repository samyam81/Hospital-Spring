-- Sample Hospitals
INSERT INTO Hospital (hospital_id, name, address, number) VALUES
(1, 'City Hospital', '123 Main Street', '555-1234'),
(2, 'General Hospital', '456 Elm Street', '555-5678');

-- Sample Nurses
INSERT INTO Nurse (nurse_id, name, hospital_id) VALUES
(1, 'Nurse Smith', 1),
(2, 'Nurse Johnson', 1),
(3, 'Nurse Brown', 2);

-- Sample Doctors
INSERT INTO Doctor (doctor_id, name, hospital_id) VALUES
(1, 'Dr. Adams', 1),
(2, 'Dr. White', 1),
(3, 'Dr. Lee', 2);

-- Sample Patients
INSERT INTO Patient (patient_id, name, address) VALUES
(1, 'John Doe', '789 Oak Street'),
(2, 'Jane Smith', '456 Pine Street'),
(3, 'Alice Johnson', '321 Maple Street');

-- Sample Appointments
INSERT INTO Appointment (appointment_id, date, doctor_id, patient_id) VALUES
(1, '2024-04-10', 1, 1),
(2, '2024-04-11', 2, 2),
(3, '2024-04-12', 3, 3);

-- Sample Treatments
INSERT INTO Treatment (treatment_id, date, appointment_id) VALUES
(1, '2024-04-10', 1),
(2, '2024-04-11', 2),
(3, '2024-04-12', 3);
