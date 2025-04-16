package com.cmcglobal.Exercise.Baitap3;

import java.util.Random;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        // Import thư viện này để tạo ra số random
        Random random = new Random();

        // Tạo ra 1 số random từ 0 -> 9 (do trong lập trình con số bắt đầu là 0)
        // Rồi cộng thêm 1 vào kết quả để tạo ra 1 số random trong khoảng từ 1 -> 10
        int randomNumber = random.nextInt(10) + 1;

        System.out.println("Chào mừng đến với trò chơi đoán số!");
        System.out.println("Tôi đã chọn một số từ 1 đến 10. Hãy thử đoán nó!");

        // Tạo 1 biến numberInput để lưu giá trị mỗi lân nhập vào
        int numberInput;

        // Tạo 1 biến count để đếm số lần user đoán
        int count = 0;

        do {
            System.out.print("Nhập số bạn đoán: ");
            numberInput = sc.nextInt();

            // Tăng số count lên 1
            count++;

            if (numberInput < randomNumber) {
                System.out.println("Quá thấp! Thử lại.");
            } else if (numberInput > randomNumber) {
                System.out.println("Quá cao! Thử lại.");
            }

            // Vòng lặp sẽ kết thúc khi số number input bằng với số random number
        } while (numberInput != randomNumber);

        System.out.println("Chính xác! Số đó là " + randomNumber);
        System.out.println("Bạn đã đoán đúng sau " + count + " lần thử.");

    }
}
