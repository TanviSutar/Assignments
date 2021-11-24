package com.database.dba;

public class Admin {

    StudentRecord databaseInstance;

    Admin(StudentRecord databaseInstance) {
        this.databaseInstance = databaseInstance;
    }

    public void addStudent(String name, int rollNo) {
        databaseInstance.addNewStudent(name, rollNo);
    }

    public boolean deleteStudentByRollNo(int rollNo) {
        return databaseInstance.deleteByRollNo(rollNo);
    }

    public boolean deleteStudentByName(String name) {
        return databaseInstance.deleteByName(name); }

    public void updateStudentByRollNo(int rollNo, String name) {
        databaseInstance.upadteByRollNo(rollNo, name);
    }
}

