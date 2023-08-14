package org.example.Seminar3.Task4;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
        super("Массив должен быть 3х3");
    }
}
