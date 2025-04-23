package com.cmcglobal.Exercise.Baitap8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCase extends BaseTest{
    @Test
    public void loginWithValidCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);

        // Kiểm tra có vào trang sản phẩm không
        assertTrue(inventoryPage.isOnInventoryPage());

        // Kiểm tra tiêu đề trang
        assertEquals("Products", inventoryPage.getTitleText());
    }

    @Test
    public void loginWithLockedOutUser() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("locked_out_user", "secret_sauce");

        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("saucedemo.com"));
    }

    @Test
    public void productList() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);
        //assertTrue(inventoryPage.getAllProducts().size() > 0);
        assertEquals(6, inventoryPage.getAllProducts().size());

    }
}
