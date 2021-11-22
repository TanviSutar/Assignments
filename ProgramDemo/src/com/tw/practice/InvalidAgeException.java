package com.tw.practice;

/**
 * An exception class for Invalid age while checking voting eligibility
 */

public class InvalidAgeException extends Exception{
    public String toString(){
        return "Invalid Age. Not eligible to vote.";
    }
}
