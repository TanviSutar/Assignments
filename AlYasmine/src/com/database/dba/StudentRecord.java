package com.database.dba;

import java.util.ArrayList;
import java.util.List;

public class StudentRecord {

    private List<Student> studentList;

    StudentRecord(){
        studentList = new ArrayList<>();
    }

    void addNewStudent(String name, int rollNo){
        Student newStudent = new Student(name, rollNo);
        studentList.add(newStudent);
    }

    void deleteStudentByRollNo(int rollNo){
        for(Student student: studentList){
            if(student.getRollNo() == rollNo){
                studentList.remove(student);
            }
        }
    }

    public Student getStudentByRollNo(int rollNo){
        for(Student student: studentList){
            if(student.getRollNo() == rollNo){
                return student;
            }
        }
        return null;
    }

    public void printAllStudent(){
        for(Student student: studentList){
            System.out.println(student);
        }
    }

    boolean upadteStudentByRollNo(int rollNo, String name){
        for(Student student: studentList){
            if(student.getRollNo() == rollNo){
                student.setName(name);
                return true;
            }
        }
        return false;
    }

}
