package com.company.libs;

public class StudentDecis {
    String nume;
    int idnp;
    boolean dornicSaInvete;

    public StudentDecis (String numeAtribut, int idnpAtribut){
        nume = numeAtribut;
        this.idnp = idnpAtribut;
    }

    public  void faceTemaPentruAcasa(){
        System.out.println(nume + " " + "este elev bravo, o sa aiba rezultate!");
        this.dornicSaInvete = true;
    };






}
