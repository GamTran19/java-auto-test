package com.cmcglobal.lesson3;


import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vui lòng nhập thông tin người dùng: ");
        String name = scanner.nextLine();

        System.out.println("Vui lòng nhập năm sinh: ");
        int yearBorn1 = scanner.nextInt();

        System.out.println("Tên người dùng là: " + name);
       System.out.println("Tuổi: " + (2025-yearBorn1));
    }
}