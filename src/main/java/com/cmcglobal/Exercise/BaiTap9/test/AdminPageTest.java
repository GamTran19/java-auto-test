package com.cmcglobal.Exercise.BaiTap9.test;

import com.cmcglobal.Exercise.BaiTap9.pages.AdminPage;
import com.cmcglobal.Exercise.BaiTap9.pages.DashboardPage;
import com.cmcglobal.Exercise.BaiTap9.pages.LoginPage;
import com.cmcglobal.Exercise.BaiTap9.test.base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdminPageTest extends BaseTest {
    private AdminPage adminPage;

    private String randomUsername;


    @BeforeEach
    public void goToAdminTab() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAsAdmin();
        DashboardPage dashboardPage = new DashboardPage(driver);
        adminPage = new AdminPage(driver);

        dashboardPage.goToAdminPage();
    }

    @Test
    public void testSearchExistingUser() {
        adminPage.searchByUsername("Admin");
        Assertions.assertTrue(driver.getPageSource().contains("Admin"));
    }

    @Test
    public void testResetSearchForm() {
        adminPage.searchByUsername("Admin");
        adminPage.clickResetButton();
    }


    private String generateRandomUsername() {
        return "user" + UUID.randomUUID().toString().substring(0, 5);
    }

}
