package HospitalManagementSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class HospitalManagementSystem {
    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        new HospitalManagementSystem().createGUI();
    }

    public void createGUI() {
        JFrame frame = new JFrame("Hospital Management System");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new GridLayout(5, 1));

        // Add Patient Button
        JButton addPatientButton = new JButton("Add Patient");
        addPatientButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addPatient();
            }
        });
        panel.add(addPatientButton);

        // Add Doctor Button
        JButton addDoctorButton = new JButton("Add Doctor");
        addDoctorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addDoctor();
            }
        });
        panel.add(addDoctorButton);

        // Schedule Appointment Button
        JButton scheduleAppointmentButton = new JButton("Schedule Appointment");
        scheduleAppointmentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                scheduleAppointment();
            }
        });
        panel.add(scheduleAppointmentButton);

        // View Appointments Button
        JButton viewAppointmentsButton = new JButton("View Appointments");
        viewAppointmentsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viewAppointments();
            }
        });
        panel.add(viewAppointmentsButton);

        frame.setVisible(true);
    }

    private void addPatient() {
        String name = JOptionPane.showInputDialog("Enter patient name:");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter patient age:"));
        String condition = JOptionPane.showInputDialog("Enter patient condition:");

        Patient patient = new Patient(name, age, condition);
        patients.add(patient);
        JOptionPane.showMessageDialog(null, "Patient added successfully!");
    }

    private void addDoctor() {
        String name = JOptionPane.showInputDialog("Enter doctor name:");
        String specialization = JOptionPane.showInputDialog("Enter doctor specialization:");

        Doctor doctor = new Doctor(name, specialization);
        doctors.add(doctor);
        JOptionPane.showMessageDialog(null, "Doctor added successfully!");
    }

    private void scheduleAppointment() {
        if (patients.isEmpty() || doctors.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please add both patients and doctors first.");
            return;
        }

        String patientName = JOptionPane.showInputDialog("Enter patient name:");
        String doctorName = JOptionPane.showInputDialog("Enter doctor name:");
        String date = JOptionPane.showInputDialog("Enter appointment date (e.g., 2024-10-20):");

        Patient patient = null;
        Doctor doctor = null;

        for (Patient p : patients) {
            if (p.getName().equals(patientName)) {
                patient = p;
                break;
            }
        }

        for (Doctor d : doctors) {
            if (d.getName().equals(doctorName)) {
                doctor = d;
                break;
            }
        }

        if (patient != null && doctor != null) {
            Appointment appointment = new Appointment(patient, doctor, date);
            appointments.add(appointment);
            JOptionPane.showMessageDialog(null, "Appointment scheduled successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Patient or doctor not found.");
        }
    }

    private void viewAppointments() {
        StringBuilder sb = new StringBuilder();
        for (Appointment appointment : appointments) {
            sb.append(appointment.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Appointments", JOptionPane.INFORMATION_MESSAGE);
    }
}

