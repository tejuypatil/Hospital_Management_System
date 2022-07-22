package com.bridgelabz.management.system;

import java.util.Map;

public class Hospital {

    String name;
    Hospital(String name){
        this.name=name;
    }
    enum Department{
        CARDIOLOGY,DENTAL,SURGERY,OPD
    }
    Patient[] patientDetails = new Patient[50];
    int index=0;
    public void add(Patient patient){
        patientDetails[index]=patient;
        index++;
    }
public void print(){
        System.out.println("------------------------------------");
        System.out.println(name);
        System.out.println("------------------------------------");
    for (int i = 0; i <index ; i++) {
        patientDetails[i].patientDetails();
        System.out.println("------------------------------------");

        }

    }
public void editDetails(String name){}

}
