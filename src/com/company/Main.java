package com.company;
import com.company.libs.StudentDecis;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World! New");

        StudentDecis student1 = new StudentDecis("Vasile", 123456789);
        student1.faceTemaPentruAcasa();
        StudentDecis student2 = new StudentDecis("Andrei", 455684512);
        student2.faceTemaPentruAcasa();
    }
}
