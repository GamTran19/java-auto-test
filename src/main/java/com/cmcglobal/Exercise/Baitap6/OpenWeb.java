package com.cmcglobal.Exercise.Baitap6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

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
        options.addArguments("--start-maximized");
        options.addArguments("--disable-web-security");
        options.addArguments("--no-proxy-server");

        Map prefs = new HashMap();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);

        options.setExperimentalOption("prefs", prefs);
    }
}
