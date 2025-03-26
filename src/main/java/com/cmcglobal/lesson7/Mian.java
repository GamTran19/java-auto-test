package com.cmcglobal.lesson7;

import org.junit.jupiter.api.Assertions;

public class Mian {
    public static void main(String[] arg){
        SinhVien thanh = new SinhVien(1,"Nguyen kim Thanh");
        System.out.println(thanh);
        Assertions.assertEquals(thanh,thanh.getCurrentSV());
    }

}
