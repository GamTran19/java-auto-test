package com.cmcglobal.Exercise.BaiTap9.test;

import com.cmcglobal.Exercise.BaiTap9.pages.DashboardPage;
import com.cmcglobal.Exercise.BaiTap9.pages.LoginPage;
import com.cmcglobal.Exercise.BaiTap9.test.base.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DashboardPageTest extends BaseTest {
    private DashboardPage dashboardPage;

    @BeforeEach
    public void init() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAsAdmin();
        dashboardPage = new DashboardPage(driver);
    }

    @Test
    public void testGoToAdminPage() {
        dashboardPage.goToAdminPage();
        assertTrue(driver.getCurrentUrl().contains("/admin/viewSystemUsers"));
    }

    @Test
    public void testGoToPIMPage() {
        dashboardPage.goToPIMPage();
        assertTrue(driver.getCurrentUrl().contains("/pim"));
    }

    @Test
    public void testGoToLeavePage() {
        dashboardPage.goToLeavePage();
        assertTrue(driver.getCurrentUrl().contains("/leave"));
    }

    @Test
    public void testGoToTimePage() {
        dashboardPage.goToTimePage();
        assertTrue(driver.getCurrentUrl().contains("/time"));
    }

    @Test
    public void testGoToRecruitmentPage() {
        dashboardPage.goToRecruitmentPage();
        assertTrue(driver.getCurrentUrl().contains("/recruitment"));
    }

    @Test
    public void testGoToMyInfoPage() {
        dashboardPage.goToMyInfoPage();
        assertTrue(driver.getCurrentUrl().contains("/viewPersonalDetails"));
    }

    @Test
    public void testGoToPerformancePage() {
        dashboardPage.goToPerformancePage();
        assertTrue(driver.getCurrentUrl().contains("/performance"));
    }

    @Test
    public void testGoToDashboardPage() {
        dashboardPage.goToDashboardPage();
        assertTrue(driver.getCurrentUrl().contains("/dashboard"));
    }

    @Test
    public void testGoToDirectoryPage() {
        dashboardPage.goToDirectoryPage();
        assertTrue(driver.getCurrentUrl().contains("/directory"));
    }

    @Test
    public void testGoToMaintenancePage() {
        dashboardPage.goToMaintenancePage();
        assertTrue(driver.getCurrentUrl().contains("/maintenance"));
    }

    @Test
    public void testGoToClaimPage() {
        dashboardPage.goToClaimPage();
        assertTrue(driver.getCurrentUrl().contains("/claim"));
    }

    @Test
    public void testGoToBuzzPage() {
        dashboardPage.goToBuzzPage();
        assertTrue(driver.getCurrentUrl().contains("/buzz"));
    }
}
