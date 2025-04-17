package com.cmcglobal.Exercise.Baitap6;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends OpenWeb {
    @Test
    public void loginSuccess() {
        // Nhập username và password hợp lệ
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Kiểm tra đã chuyển đến trang inventory
        assertTrue(driver.getCurrentUrl().contains("inventory"));
    }

    @Test
    public void loginFail() {
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        driver.findElement(By.id("password")).sendKeys("wrong_pass");
        driver.findElement(By.id("login-button")).click();

        // Kiểm tra thông báo lỗi hiển thị
        String errorMsg = driver.findElement(By.cssSelector("[data-test='error']")).getText();
        assertTrue(errorMsg.contains("Username and password do not match"));
    }
}
