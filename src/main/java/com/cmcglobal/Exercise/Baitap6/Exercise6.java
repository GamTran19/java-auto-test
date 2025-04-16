package com.cmcglobal.Exercise.Baitap6;

public class Exercise6 {
    public static void main(String[] arg) {
        // Tạo tài khoản tiết kiệm
        SavingsAccount saveAcc = new SavingsAccount("Nguyễn Văn A", 1000000);
        saveAcc.displayBalance();
        saveAcc.withdraw(300000); // Hợp lệ
        saveAcc.deposit(200000);
        saveAcc.deposit(10, "USD");
        saveAcc.displayBalance();

        System.out.println();

        // Tạo tài khoản vãng lai
        CurrentAccount curAcc = new CurrentAccount("Trần Thị B", 500000);
        curAcc.displayBalance();
        curAcc.withdraw(600000); // Không đủ tiền
        curAcc.deposit(100, "EUR");
        curAcc.withdraw(400000);
        curAcc.displayBalance();
    }
}
