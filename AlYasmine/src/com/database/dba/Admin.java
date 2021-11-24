package com.database.dba;

public class Admin {

    StudentRecord databaseInstance;

    Admin(StudentRecord databaseInstance){
        this.databaseInstance = databaseInstance;
    }

    public void addStudent(String name, int rollNo){
        databaseInstance.addNewStudent(name, rollNo);
    }

    public void deleteStudentByRollNo(int rollNo){
        databaseInstance.deleteStudentByRollNo(rollNo);
    }

    public void updateStudentByRollNo(int rollNo, String name){
        databaseInstance.upadteStudentByRollNo(rollNo, name);
    }
}

