package com.database.dba;

public class Student {
    private String name;
    private int rollNo;

    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    String getName(){
        return name;
    }

    int getRollNo(){
        return rollNo;
    }

    void setName(String name){
        this.name = name;
    }

    void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }

    public String toString(){
        return this.rollNo+" "+this.name;
    }
}
