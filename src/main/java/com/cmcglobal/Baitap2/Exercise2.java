package com.cmcglobal.Baitap2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        // Nhập điểm từ người dùng
        System.out.println("Hãy nhập phần trăm cần tra cứu: ");
        int percent = sc.nextInt();

        // Xác định xếp loại
        switch (1) {
            case 1:
                if (percent >= 90 && percent <= 100) {
                    System.out.println("Xếp loại của bạn là A");
                    break;
                }
            case 2:
                if (percent >= 80 && percent <= 89) {
                    System.out.println("Xếp loại của bạn là B ");
                    break;
                }
            case 3:
                if (percent >= 70 && percent <= 79) {
                    System.out.println("Xếp loại của bạn là C");
                    break;
                }
            case 4:
                if (percent >= 60 && percent <= 69) {
                    System.out.println("Xếp loại của bạn là D");
                    break;
                }
            case 5:
                if (percent >= 0 && percent <= 59) {
                    System.out.println("Xếp loại của bạn là E");
                    break;
                }
            default:
                System.out.println("Không nằm trong bảng xếp loại");
                break;
        }

    }
}
