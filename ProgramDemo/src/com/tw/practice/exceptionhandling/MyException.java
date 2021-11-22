package com.tw.practice.exceptionhandling;

public class MyException extends Exception{
    MyException(int message){
        super(String.valueOf(message));
    }
}
