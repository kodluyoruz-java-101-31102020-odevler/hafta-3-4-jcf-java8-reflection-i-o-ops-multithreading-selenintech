package com.kodluyoruz.selen.question6;

import com.kodluyoruz.selen.question3.Student;
import com.kodluyoruz.selen.question3.StudentScannerUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) throws IOException {

        File file = getFile();
        if(file == null){
            System.out.println("File not found!");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for new record or enter 2 for list records");
        int selection = scanner.nextInt();
        if(selection == 1){
            Student student = StudentScannerUtils.readFromCommandLine();
            writeObjectToFile(file,student);
        }
        else if(selection == 2){
            List<Student> studentList = readObjectFromFile(file);
            studentList.forEach(System.out::println);
        }
    }

    public static File getFile(){
        try {
            File file = new File("studentInfo.txt");
            file.createNewFile();
            return file;
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void writeObjectToFile(File file, Student student) {

        List<Student> studentList = readObjectFromFile(file);
        studentList.add(student);
        try {
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(studentList);
            objectOut.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public static List<Student> readObjectFromFile(File file) {
        List<Student> studentList = new ArrayList<>();
        boolean hasStudent = true;

        try {
            FileInputStream fileInput= new FileInputStream(file);
            ObjectInputStream objectInput = new ObjectInputStream(fileInput);
            List<Student> students = (List<Student>) objectInput.readObject();
            studentList.addAll(students);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException | ClassNotFoundException e ) {
            e.printStackTrace();
        }

        return studentList;
    }



}
