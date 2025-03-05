package com.cmcglobal.lesson5;
import java.util.Random;
import java.util.Scanner;

public class WhiteLoop {
    public static void main(String[] arg){
     Random rand = new Random();
     Scanner scanner = new Scanner(System.in);

     /*
     Bài 1: In ra các sô thứ tự từ 1 đến 10 trên từng dòng
                a. Viết bằng vòng lặp white
                b. Viết bằng vòng lặp do white
    */
        //a.
//        int i = 0;
//        while ( i < 10 ){
//            System.out.println (i + 1);
//            i++;
//        }
        //b
       int i = 1;
       do{
           i ++;
           System.out.println(i);
       } while (i < 10);


   /*
     Bài 2: In ra các sô chẵn trong đoạn  từ 2 ~ 20
                a. Không dùng if
                b. Dùng if (dùng break hoặc continue)
    */
        //a.
//        int i = 1;
//        while (i <= 10){
//            System.out.println( i * 2);
//            i ++;
//        }

        //b.
//        int i = 1;
//        while (i <= 19){
//            i ++;
//            if (i % 2 == 1){
//                continue;
//            }
//            System.out.println(i);
//        }

        //Cách 2
//        int i = 1;
//        while (i <= 100){
//            i ++;
//            if (i % 2 == 1){
//                continue;
//            }
//            System.out.println(i);
//            if (i >= 20){
//                break;
//            }
//        }

   /*
     Bài 3: In ra các số trong khoảng  từ 1 ~ 30  mà không chia hết cho 2 và không chia hết cho 3
    */

        /*
     Bài 4: Người dùng nhp vào 2 số tự nhiên a và b
     Nếu bội chung nhỏ nhất lớn hơn 100:
        in ra: Bội chung nhỏ nhất đang lớn hơn 100
      Else:
        in ra bội chung nhỏ nhất cuả a và b
        (bội chung nhỏ nhất là số tự nhiên chia hết cho cả a và b)

    */
//        System.out.println("Xin hãy nhập số a:");
//        int a = scanner.nextInt();
//        System.out.println("Xin hãy nhập số b:");
//        int b = scanner.nextInt();
//        int temp = 0;
//        int multiply = 1;
//        boolean getMultiply = true;
//        do {
//            temp = a * multiply;
//            if (temp > 100) {
//                System.out.println("Bội chung nhỏ nhất đang lớn hơn 100");
//                getMultiply = false;
//                break;
//            }
//            multiply++;
//        } while (temp % b != 0);
//        if (getMultiply) {
//            System.out.println(temp);
//        }

    }
}
