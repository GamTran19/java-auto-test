package com.cmcglobal.Exercise.BaiTap9.test;

import com.cmcglobal.Exercise.BaiTap9.pages.AdminPage;
import com.cmcglobal.Exercise.BaiTap9.pages.DashboardPage;
import com.cmcglobal.Exercise.BaiTap9.pages.LoginPage;
import com.cmcglobal.Exercise.BaiTap9.pages.PIMPage;
import com.cmcglobal.Exercise.BaiTap9.test.base.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PIMPageTest extends BaseTest {

    private PIMPage pimPage;
    @BeforeEach
    public void init() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAsAdmin();
        DashboardPage dashboardPage = new DashboardPage(driver);
        pimPage = new PIMPage(driver);

        dashboardPage.goToPIMPage();
    }

    @Test
    public void testSearchEmployeeByName() {
        pimPage.searchEmployeeByName("Linda");

        // Kiểm tra kết quả tìm kiếm
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("pim/viewEmployeeList"), "Không chuyển đến trang danh sách nhân viên.");
    }

    @Test
    public void testAddNewEmployee() {
        String firstName = "John";
        String lastName = "Doe" + System.currentTimeMillis();

        pimPage.clickAddButton();
        pimPage.fillEmployeeForm(firstName, lastName);
        pimPage.clickSave();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("/pim/viewPersonalDetails"));
        // Sau khi lưu, kiểm tra URL hoặc tên hiển thị
        assertTrue(driver.getCurrentUrl().contains("/pim/viewPersonalDetails"));
        assertTrue(pimPage.isPersonalDetailsPage());
    }
}
