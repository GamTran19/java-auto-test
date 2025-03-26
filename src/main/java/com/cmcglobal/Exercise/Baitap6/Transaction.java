package com.cmcglobal.Exercise.Baitap6;

// Interface định nghĩa các hành động giao dịch chung
public interface Transaction {
    // Nạp tiền
    void deposit(double amount);

    // Rút tiền
    void withdraw(double amount);
}
