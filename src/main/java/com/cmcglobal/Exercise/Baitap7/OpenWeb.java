package com.cmcglobal.Exercise.Baitap7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class OpenWeb {
    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        offPopupAutoPassword();
        driver = new ChromeDriver(); // Khởi chạy trình duyệt Chrome
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com"); // Truy cập trang web
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Đóng trình duyệt sau mỗi test
        }
    }

    public void offPopupAutoPassword() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-infobars");
        options.setExperimentalOption("prefs", new HashMap() {{
            put("credentials_enable_service", false);
            put("profile.password_manager_enabled", false);
        }});
    }
}
