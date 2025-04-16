package com.cmcglobal.Exercise.Baitap2;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Exercise 5: Leap Year Checker

// người dùng Nhập một năm.
        System.out.println("Nhập một năm: ");
        int yaer = scanner.nextInt();

        // Thực hiện các phép toán và hiển thị kết quả
        if ((yaer % 4 == 0 && yaer % 100 != 0) || yaer % 400 == 0) {
            System.out.println(yaer + " là năm nhuận.");
        } else {
            System.out.println(yaer + " không phải là năm nhuận.");
        }

    }

}
