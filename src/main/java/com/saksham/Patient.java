package com.saksham;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Patient {
    private String name;
    private static int patientCount = 0;
    public Patient(String name) {
        this.name = name;
        patientCount++;
        System.out.println("Created: " + name
                + " (Count: " + patientCount + ")");
    }
    public static int getPatientCount() {
        return patientCount;
    }
    public static void main(String[] args) {
        Patient p1 = new Patient("Ravi");
        Patient p2 = new Patient("Priya");
        Patient p3 = new Patient("Amit");
        Patient p4 = new Patient("Sneha");
        System.out.println("\nTotal Patients: "
                + Patient.getPatientCount());
    }
}
