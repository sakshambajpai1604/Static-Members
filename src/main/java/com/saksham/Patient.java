package com.saksham;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Patient {
    private String name;
    private int patientId;
    private static int nextId = 1001;
    public Patient(String name) {
        this.name = name;
        this.patientId = nextId;
        nextId++;
    }
    public void display() {
        System.out.println("ID: " + patientId
                + " | Name: " + name);
    }
    public static int getNextId() { return nextId; }
    public static void main(String[] args) {
        Patient p1 = new Patient("Ravi");
        Patient p2 = new Patient("Priya");
        Patient p3 = new Patient("Amit");
        p1.display();
        p2.display();
        p3.display();
        System.out.println("\nNext available ID: "
                + Patient.getNextId());
    }
}
