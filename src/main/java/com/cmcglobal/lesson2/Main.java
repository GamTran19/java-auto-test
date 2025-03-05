package com.cmcglobal.lesson2;

public class Main {
    public static void main(String[] args) {
        float x = 5;
        float y = 3;
        float z ;

        z = x / y;

        x /= 3;
        y =  x % 3;

        System.out.println(z);
        System.out.println(x);
        System.out.println(y);
    }
}