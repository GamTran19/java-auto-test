package com.cmcglobal.lesson7;

public class SinhVien {
    private int msv;
    private String hoten;
public SinhVien(int msv, String hoten){
    this.msv = msv;
    this.hoten = hoten;
}
public SinhVien getCurrentSV(){
    return this;
}

}
