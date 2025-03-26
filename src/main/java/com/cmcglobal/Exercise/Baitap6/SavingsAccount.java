package com.cmcglobal.Exercise.Baitap6;

public class SavingsAccount extends BankAccount implements Transaction {
    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    // Rút tiền: chỉ cho phép rút nếu số dư còn >= 50000
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 50000) {
            balance -= amount;
            System.out.println("Rút " + amount + " VND thành công từ tài khoản tiết kiệm.");
        } else {
            System.out.println("Không đủ số dư tối thiểu (>= 50,000 VND). Rút thất bại.");
        }
    }

    // Ghi đè phương thức của interface
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Nạp " + amount + " VND vào tài khoản tiết kiệm.");
    }

    // Nạp tiền (overload): với tiền ngoại tệ
    public void deposit(double amount, String currency) {
        double rate = 1.0;

        if (currency.equalsIgnoreCase("USD")) {
            rate = 24000;
        } else if (currency.equalsIgnoreCase("EUR")) {
            rate = 26000;
        }

        double converted = amount * rate;
        balance += converted;
        System.out.println("Nạp " + amount + " " + currency + " (≈ " + converted + " VND) vào tài khoản tiết kiệm.");
    }
}
