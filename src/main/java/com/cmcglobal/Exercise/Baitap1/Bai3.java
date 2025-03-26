package com.cmcglobal.Exercise.Baitap1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//  Exercise 3: BMI Calculator

//       // Nhập cân nặng và chiều cao
        System.out.println("Nhập cân nặng của bạn (kg): ");
        float weight = scanner.nextFloat();
        System.out.println("Nhập chiều cao của bạn (m):");
        float height = scanner.nextFloat();

        // Tính chỉ số khối cơ thể (BMI) theo công thức: BMI = cân nặng / (chiều cao * chiều cao).
        System.out.println("Your BMI is: " + (weight / (height * height)));


    }

}
