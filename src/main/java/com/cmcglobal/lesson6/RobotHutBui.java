package com.cmcglobal.lesson6;

public class RobotHutBui {

    private String model;
    private int theTich;
    private int trongLuong;
    private int luongNuoc;

    public RobotHutBui(String model, int thetich){
        this.model = model;
        this.theTich = thetich;
        this.trongLuong = thetich * 2 + 100;
        this.luongNuoc = 0;
    }

    public int getTrongluong(){
        return this.trongLuong;
    }

    public  int getLuongNuoc(){
        return this.luongNuoc;
    }

    public  void layNuoc(){
        this.luongNuoc = theTich;
    }

    public int chamNuoc(){
        layNuoc();
        int NuocDoRa = this.luongNuoc;
        this.luongNuoc = 0;
        return NuocDoRa;
    }

}
