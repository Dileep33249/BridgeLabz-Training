package main;

import dao.PatientDAO;
import model.Patient;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Patient patient = new Patient(
                "Dileep",
                LocalDate.of(2000, 5, 10),
                "9876543210",
                "dileep@gmail.com",
                "Delhi",
                "O+"
        );

        PatientDAO dao = new PatientDAO();
        dao.addPatient(patient);
    }
}
