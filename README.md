# Hospital-Spring

## Description
Hospital-Spring is a demo project for Spring Boot, aiming to showcase the usage of Spring Boot in a hospital management system.

## Author
This project was created by [Samyam](https://github.com/samyam81).

## Prerequisites
- JDK 17 or higher
- Maven 3.6.3 or higher

## Installation
1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/Hospital-Spring.git
    ```
2. Navigate into the project directory:
    ```bash
    cd Hospital-Spring
    ```
3. Build the project using Maven:
    ```bash
    mvn clean install
    ```

## Usage
1. Start the application:
    ```bash
    mvn spring-boot:run
    ```
2. Access the application through the browser or REST client at `http://localhost:8080`

## File Structure (inside src)
- **Entity**: Contains entity classes representing various entities in the hospital management system.
  - **Appointment**: Represents an appointment in the hospital.
  - **Check**: Represents a check or examination record.
  - **Doctor**: Represents a doctor in the hospital.
  - **Nurse**: Represents a nurse in the hospital.
  - **Patient**: Represents a patient in the hospital.
  - **Treatment**: Represents a treatment record for a patient.
- **Repo**: Contains repository classes responsible for database operations.
  - **AppointmentRepo**: Handles database operations related to appointments.
  - **CheckRepo**: Handles database operations related to checks or examinations.
  - **DoctorRepo**: Handles database operations related to doctors.
  - **NurseRepo**: Handles database operations related to nurses.
  - **PatientRepo**: Handles database operations related to patients.
  - **TreatmentRepo**: Handles database operations related to treatments.
- **Resource**: Contains configuration files and database scripts.
  - **Check.sql**: SQL script for creating the table to store check or examination records.
  - **ER.jpg**: Entity-Relationship diagram of the hospital management system.
  - **application.properties**: Properties file for configuring Spring Boot application properties.
  - **data.sql**: SQL script for inserting initial data into the database.
  - **Schema.sql**: SQL script for creating the database schema.

## Technologies Used
- Spring Boot 3.2.4
- H2 Database
- Lombok 1.18.26
- Maven

## Contributing
Contributions are welcome! Please feel free to open a pull request or submit an issue if you find any problems or have suggestions for improvement.
