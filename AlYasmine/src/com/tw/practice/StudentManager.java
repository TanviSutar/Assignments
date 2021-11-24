package com.tw.practice;

public class StudentManager {
    public static void main(String[] args) {

        StudentRecord databaseInstance = new StudentRecord();

        Admin admin1 = new Admin(databaseInstance);
        admin1.addStudent("tanvi", 34);
        admin1.addStudent("priya", 32);

        admin1.updateStudentByRollNo(34, "sejal");

        Teacher teacher1 = new Teacher(databaseInstance);

        teacher1.printStudentList();
    }
}

