package src.com.example.exceptionhandling;

import src.com.example.exceptionhandling.MyException;

import  java.io.IOException;

public class Exception {
    public static void main(String[] args) throws IOException {
        System.out.println("Operations");
        sum(1,2);
    }
    public static void sum(int a,int b) throws IOException {
        int sum = a+b;
        throw new MyException("Random Exception");
    }
}