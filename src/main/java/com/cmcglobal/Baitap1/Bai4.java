package com.cmcglobal.Baitap1;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//Exercise 4: Counter Program

        // người dùng nhập một số nguyên.
        System.out.println("Nhập một số nguyên: ");
        int X = scanner.nextInt();

        // Thực hiện các phép toán và hiển thị kết quả
        System.out.println("Sau khi tăng: " + (++X));
        System.out.println("Sau khi giảm: " + (--X));


    }

}
