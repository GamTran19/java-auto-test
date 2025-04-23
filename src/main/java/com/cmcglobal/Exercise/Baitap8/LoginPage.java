package com.cmcglobal.Exercise.Baitap8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // Khai báo các WebElement (thành phần giao diện)
    private By usernameInput = By.id("user-name");
    private By passwordInput = By.id("password");
    private By loginButton = By.id("login-button");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Hành động: nhập username
    public void enterUsername(String username) {
        driver.findElement(usernameInput).sendKeys(username);
    }

    // Hành động: nhập password
    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    // Hành động: nhấn login
    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    // Phương thức thực hiện login đầy đủ
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}
