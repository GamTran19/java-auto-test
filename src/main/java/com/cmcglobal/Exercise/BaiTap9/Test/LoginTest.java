package com.cmcglobal.Exercise.BaiTap9.Test;
import com.cmcglobal.Exercise.BaiTap9.Main.LoginPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest  extends BaseTest {

    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("Admin", "admin123");

        // Kiểm tra URL sau khi đăng nhập
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("/dashboard"), "Đăng nhập không thành công.");
    }
}
