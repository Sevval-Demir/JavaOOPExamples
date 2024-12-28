package Appointmnet;

import Doctor.Doctor;
import Patient.Patient;

public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String date;

    public Appointment(Patient patient, Doctor doctor, String date) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Appointment [Patient: " + patient.getName() + ", Doctor: " + doctor.getName() + ", Date: " + date + "]";
    }
}

