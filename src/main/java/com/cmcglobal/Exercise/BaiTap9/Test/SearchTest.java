package com.cmcglobal.Exercise.BaiTap9.Test;

import com.cmcglobal.Exercise.BaiTap9.Main.LoginPage;
import com.cmcglobal.Exercise.BaiTap9.Main.PIMPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchTest extends BaseTest {

    @Test
    public void testSearchEmployeeByName() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("Admin", "admin123");

        PIMPage pimPage = new PIMPage(driver);
        pimPage.searchEmployeeByName("Linda");

        // Kiểm tra kết quả tìm kiếm
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("pim/viewEmployeeList"), "Không chuyển đến trang danh sách nhân viên.");
    }
}
