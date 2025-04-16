package com.cmcglobal.Exercise.Baitap7;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class ProductTest extends OpenWeb{
    private void login() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @Test
    public void allProductsShouldBeDisplayed() {
        login();
        List<WebElement> products = driver.findElements(By.className("inventory_item"));
        assertEquals(6, products.size()); // Có đúng 6 sản phẩm?
    }

    @Test
    public void eachProductShouldHaveNameAndPrice() {
        login();
        List<WebElement> names = driver.findElements(By.className("inventory_item_name"));
        List<WebElement> prices = driver.findElements(By.className("inventory_item_price"));

        assertFalse(names.isEmpty());
        assertFalse(prices.isEmpty());
        assertEquals(names.size(), prices.size());
    }
}
