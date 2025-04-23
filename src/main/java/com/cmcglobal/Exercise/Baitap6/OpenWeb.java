package com.cmcglobal.Exercise.Baitap6;

import io.github.bonigarcia.wdm.WebDriverManager;
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

        // Cấu hình cho chrome không hiện thị pop up cảnh báo password
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito"); // cài chế độ ẩn danh
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-save-password-bubble");

        options.setExperimentalOption("prefs", new HashMap<>() {{
            put("credentials_enable_service", false);
            put("profile.password_manager_enabled", false);
        }});

//        WebDriverManager.chromedriver().setup();
//        ChromeOptions chromeOption = new ChromeOptions();
//        chromeOption.setExperimentalOption("credentials_enable_service", false);
//        chromeOption.setExperimentalOption("profile.password_manager_enabled", false);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com"); // Truy cập trang web
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Đóng trình duyệt sau mỗi test
        }
    }

}
