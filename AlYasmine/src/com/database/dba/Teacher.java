package com.database.dba;

public class Teacher {
    StudentRecord databaseInstance;

    Teacher(StudentRecord databaseInstance) {
        this.databaseInstance = databaseInstance;
    }

    public Student getStudentByRollNo(int rolNo) {
        return databaseInstance.getByRollNo(rolNo);
    }

    public Student getStudentByName(String name) {
        return databaseInstance.getByName(name); }

    public void printStudentList() {
        databaseInstance.printAllStudents();
    }
}

