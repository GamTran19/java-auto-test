package com.cmcglobal.Exercise.BaiTap9.test;

import com.cmcglobal.Exercise.BaiTap9.pages.DashboardPage;
import com.cmcglobal.Exercise.BaiTap9.pages.LoginPage;
import com.cmcglobal.Exercise.BaiTap9.test.base.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPageTest extends BaseTest {

    private LoginPage loginPage;
    @BeforeEach
    public void init() {
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testValidLogin() {
        loginPage.loginAsAdmin();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("/dashboard"));
        // Kiểm tra URL sau khi đăng nhập
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("/dashboard"), "Đăng nhập không thành công.");
    }

    @Test
    public void testInvalidLogin() {
        loginPage.enterUsername("wronguser");
        loginPage.enterPassword("wrongpass");
        loginPage.clickLogin();

        // Kiểm tra thông báo lỗi
        String errorMsg = loginPage.getErrorMessage();
        assertEquals("Invalid credentials", errorMsg);
    }
}
