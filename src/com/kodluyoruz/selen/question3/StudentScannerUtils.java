package com.kodluyoruz.selen.question3;

import java.util.Scanner;

public class StudentScannerUtils {

    public static Student readFromCommandLine(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your student ID: ");
        String studentID = scanner.next();
        System.out.println("Please enter your name: ");
        String name = scanner.next();
        System.out.println("Please enter your surname: ");
        String surname = scanner.next();
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Please enter your department: ");
        String department = scanner.next();


        Student student =  new Student(studentID);
        student.setName(name);
        student.setSurname(surname);
        student.setAge(age);
        student.setDepartment(department);

        return student;
    }
}
