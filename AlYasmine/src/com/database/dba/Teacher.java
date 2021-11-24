package com.database.dba;

public class Teacher {
    StudentRecord databaseInstance;

    Teacher(StudentRecord databaseInstance){
        this.databaseInstance = databaseInstance;
    }

    public Student getStudentByRollNo(int rolNo){
        return databaseInstance.getStudentByRollNo(rolNo);
    }

    public void printStudentList(){
        databaseInstance.printAllStudent();
    }
}

