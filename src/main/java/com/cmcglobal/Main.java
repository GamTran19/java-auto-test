package com.cmcglobal;

import com.cmcglobal.lesson6.RobotHutBui;

public class Main {
    public static void main(String[] args) {

        int binhNuoc = 0 ;

        System.out.println("Hello, work");
        RobotHutBui robot_1 = new RobotHutBui(  "XB_1",  10);
        System.out.println("Hoàn tất tạo ra một robot hút bụi đặt tên robot_1");
        RobotHutBui robot_2 = new RobotHutBui(  "XB_2",  30);
        System.out.println("trọng lượng của robot_1 là: " + robot_1.getTrongluong());
        System.out.println("trọng lượng của robot_2 là: " + robot_2.getTrongluong());


//        System.out.println("Lượng nước trong robot_1 là: " + robot_1.getLuongNuoc());
////        robot_1.layNuoc();
////        System.out.println("Lượng nước trong robot_1 sau khi lâý nước là: " + robot_1.getLuongNuoc());
        binhNuoc += robot_1.chamNuoc();
        System.out.println("Lượng nước trong robot_1 sau khi châm nước là: " + robot_1.getLuongNuoc());
        System.out.println("Lượng nước trong bình hiện tai là: " + binhNuoc);
//        robot_2.layNuoc();
        binhNuoc += robot_2.chamNuoc();
        System.out.println("Lượng nước trong bình sau khi robot_2 châm nước là: " + binhNuoc);
        binhNuoc += robot_2.chamNuoc();
        System.out.println("Lượng nước trong bình sau khi robot_2 châm nước lần 2 là: " + binhNuoc);

    }
}
