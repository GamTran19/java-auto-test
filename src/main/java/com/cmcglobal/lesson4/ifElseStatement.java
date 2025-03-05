package com.cmcglobal.lesson4;

import java.util.Scanner;

public class ifElseStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Baì 1: Người dùng nập 1 số nguyên dương
        In ra terminal "Số chẵn" nếu người dùng nập số chẵn
        In ra terminal "Số lẻ" Nếu người dùng nhp số lẻ
         */
//        System.out.println("Nhập số nguyên dương:") ;
//        int inputNumber = scanner.nextInt();
//        if (inputNumber % 2 == 0) {
//            System.out.println("Số chẵn");
//        }else {
//            System.out.println("Số lẻ");
//        }

        System.out.println("Nhập số nguyên dương: ");
        int inputNumber = scanner.nextInt();
        System.out.println(inputNumber % 2 == 0 ? "số chẵn" : "số lẻ");

        /*
        bài 2: Người dùng nhập vào 1 só thực dương
        In ra terminal "Số chẵn" nếu người dùng nập số chẵn
        In ra terminal "Số lẻ" Nếu người dùng nhp số lẻ
        In ra terminal "Không phải số tự nhiên" nếu nguời dùng nhập vào 1 số thập phân
         */
//        System.out.println("Nhập số thực dương:") ;
//        float inputNumber = scanner.nextFloat();
//        if (inputNumber % 2 == 0) {
//            System.out.println("Số chẵn");
//        }else if(inputNumber % 2 == 1) {
//            System.out.println("Số lẻ");
//        }else {
//            System.out.println("Không phải là số tự nhiên");
//        }

        /*
        bài 3: người dùng nhập vào số điểm trong khoảng 0 ~ 100
        In ra "loại A" nếu số điểm lớn hơn 89
        In ra "Loại B" nếu số điểm trong khoảng 80 ~ 89
        In ra "Loại C" nếu số điểm trong khoảng 70 ~ 79
        In ra "Loại D" nếu số điểm trong khoảng 60 ~ 69
        In ra "Loại F" nếu số điểm nhỏ hơn 60
         */
//        System.out.println("Nhập số điểm:");
//        int score = scanner.nextInt();
//        if (score > 89){
//            System.out.println("Loại A");
//        } else if (score > 79) {
//            System.out.println("Loại B");
//        } else if (score > 69) {
//            System.out.println("Loại C");
//        } else if (score > 59) {
//            System.out.println("Loại D");
//        }else {
//            System.out.println("Loại F");
//        }

        /*
        bài 4: người dùng nhập vào số điểm trong khoảng 0 ~ 100
        In ra "Được nhận học bổng toàn phần" nếu số điểm lớn hơn 95 kèm "loại A"
        In ra "Loại A" nếu số điểm lớn hơn 95
        In ra "Được nhận học bổng bán phần" nếu số điểm nằm trong khoảng 86 ~ 95
        In ra "Loại B" nếu số điểm trong khoảng 80 ~ 89
        In ra "Không nhận được học bổng" nếu số điểm từ dưới 86 kèm loại tương ứng
        In ra "Loại C" nếu số điểm trong khoảng 70 ~ 79
        In ra "Loại D" nếu số điểm trong khoảng 60 ~ 69
        In ra "Loại F" nếu số điểm nhỏ hơn 60
         */
//        System.out.println("Nhập số điểm:");
//        int score = scanner.nextInt();
//
//        if(score >95){
//            System.out.println("Được nhận học bổng toàn phần");
//        }
//        if (score < 96 && score > 85){
//            System.out.println("Được nhận học bổng bán phần");
//        }
//        if (score < 86){
//            System.out.println("Không nhận được học bổng");
//        }
//
//        if (score > 89){
//            System.out.println("Loại A");
//        } else if (score > 79) {
//            System.out.println("Loại B");
//        } else if (score > 69) {
//            System.out.println("Loại C");
//        } else if (score > 59) {
//            System.out.println("Loại D");
//        }else {
//            System.out.println("Loại F");
//        }


    }

}
