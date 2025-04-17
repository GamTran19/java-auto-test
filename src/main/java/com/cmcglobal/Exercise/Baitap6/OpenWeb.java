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
        System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");

        // Cấu hình cho chrome không hiện thị pop up cảnh báo password
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito"); // cài chế độ ẩn danh
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-save-password-bubble");

        options.setExperimentalOption("prefs", new HashMap<>() {{
            put("credentials_enable_service", false);
            put("profile.password_manager_enabled", false);
        }});

        Map<String, Boolean> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);

        driver = new ChromeDriver(options); // Khởi chạy trình duyệt Chrome
        driver.get("https://www.saucedemo.com"); // Truy cập trang web
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Đóng trình duyệt sau mỗi test
        }
    }

}
