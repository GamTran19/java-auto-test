package com.cmcglobal.Exercise.Baitap6;

abstract class BankAccount {
    protected String accountHolder;  // Tên chủ tài khoản
    protected double balance;        // Số dư tài khoản

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Phương thức trừu tượng bắt buộc lớp con phải ghi đè
    public abstract void withdraw(double amount);

    // Phương thức cụ thể để hiển thị số dư
    public void displayBalance() {
        System.out.println("Số dư hiện tại: " + balance + " VND");
    }
}