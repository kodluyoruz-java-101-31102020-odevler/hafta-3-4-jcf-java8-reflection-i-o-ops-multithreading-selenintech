package com.kodluyoruz.selen.question3;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Student> students = new HashMap<>();
        Student student = StudentScannerUtils.readFromCommandLine();
        students.put(student.getStudentID(), student);

    }
}
