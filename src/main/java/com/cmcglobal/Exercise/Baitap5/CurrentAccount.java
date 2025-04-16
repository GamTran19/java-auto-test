package com.cmcglobal.Exercise.Baitap5;

class CurrentAccount extends BankAccount implements Transaction {

    public CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    // Rút tiền: không yêu cầu giữ lại số dư tối thiểu
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Rút " + amount + " VND thành công từ tài khoản vãng lai.");
        } else {
            System.out.println("Số dư không đủ. Rút thất bại.");
        }
    }

    // Nạp tiền (cơ bản)
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Nạp " + amount + " VND vào tài khoản vãng lai.");
    }

    // Nạp tiền có chuyển đổi ngoại tệ (overload)
    public void deposit(double amount, String currency) {
        double rate = 1.0;

        if (currency.equalsIgnoreCase("USD")) {
            rate = 24000;
        } else if (currency.equalsIgnoreCase("EUR")) {
            rate = 26000;
        }

        double converted = amount * rate;
        balance += converted;
        System.out.println("Nạp " + amount + " " + currency + " (≈ " + converted + " VND) vào tài khoản vãng lai.");
    }
}
