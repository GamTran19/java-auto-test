package com.cmcglobal.Exercise.Baitap2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        Exercise 2:Temperature Converter

        // Nhập nhiệt độ theo độ C
        System.out.println("Nhập nhiệt độ theo độ C: ");
        float C = scanner.nextFloat();

        // Chuyển đổi nhiệt độ sang độ F (Fahrenheit) theo công thức: F = (C * 9/5) + 32
        System.out.println("Temperature in Fahrenheit: " + ((C * 9 / 5) + 32));


    }

}
