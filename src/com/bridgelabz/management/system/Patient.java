package com.bridgelabz.management.system;

public class Patient {
    String patient_name;
    int patientID;

    String city;
    String state;
    Hospital.Department department;

    Patient(String patient_name,int patientID, Hospital.Department department,String city,String state){
        this.patient_name=patient_name;
        this.patientID=patientID;
        this.department=department;
        this.city=city;
        this.state=state;
    }
public void patientDetails(){
        System.out.println("Patient Name: "+patient_name);
        System.out.println("Patient ID: "+patientID);
        System.out.println("Department Name: "+department);
        System.out.println("City: "+city);
        System.out.println("State: "+state);

}
}
