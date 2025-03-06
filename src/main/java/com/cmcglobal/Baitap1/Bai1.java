package com.cmcglobal.Baitap1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Exercise 1:Simple Calculator

        // Nhập hai số nguyên từ người dùng
        System.out.println("Enter the first integer: ");
        int first = scanner.nextInt();
        System.out.println("Enter the second integer: ");
        int second = scanner.nextInt();

        // Thực hiện các phép toán và hiển thị kết quả
        System.out.println("Addition: " + (first + second));   // Cộng
        System.out.println("Subtraction: " + (first - second)); // Trừ
        System.out.println("Multiplication: " + (first * second)); // Nhân
        System.out.println("Division: " + ((double) first / second)); //Chia


    }
}
