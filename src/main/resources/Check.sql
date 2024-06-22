-- check.sql

-- Create table 'pass' with correct syntax
CREATE TABLE pass (
    Eno INT PRIMARY KEY,
    pass VARCHAR(20)
);

-- Insert sample data into 'pass'
INSERT INTO pass (Eno, pass) VALUES
(1, '0000'),
(2, '0011');
