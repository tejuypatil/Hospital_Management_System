package com.bridgelabz.management.system;

import java.util.HashMap;
import java.util.Map;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to Hospital Management System");



        Patient patient1 = new Patient("Rama", 4122,Hospital.Department.CARDIOLOGY,"Kolhapur","Maharashtra");
        Patient patient2 = new Patient("Reva", 4100,Hospital.Department.DENTAL,"Belgaum","Karnataka");
        Patient patient3 = new Patient("Roma", 4112,Hospital.Department.SURGERY,"Kolhapur","Maharashtra");
        Patient patient4 = new Patient("Rakhi", 4156,Hospital.Department.OPD,"Belgaum","Karnataka");


        Map<String,Hospital> hospitalMap=new HashMap<>();



        Hospital hospital1=new Hospital("SHARDA HOSPITAL");
        hospital1.add(patient1);
        hospital1.add(patient3);
        hospital1.print();

        Hospital hospital2=new Hospital("MAULI HOSPITAl");
        hospital2.add(patient2);
        hospital2.add(patient4);

        hospital2.print();
    }
}
