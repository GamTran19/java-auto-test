package com.cmcglobal.Exercise.Baitap6;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Checkout extends OpenWeb {
    private void loginAndAddToCart() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.cssSelector(".inventory_item button")).click(); // Thêm sản phẩm đầu tiên
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();
    }

    @Test
    public void canGoToCheckoutStepOne() {
        loginAndAddToCart();
        System.out.println(driver.getCurrentUrl());
        assertTrue(driver.getCurrentUrl().contains("checkout-step-one"));
    }

    @Test
    public void canCompleteCheckout() {
        loginAndAddToCart();

        driver.findElement(By.id("first-name")).sendKeys("Nguyen");
        driver.findElement(By.id("last-name")).sendKeys("Van");
        driver.findElement(By.id("postal-code")).sendKeys("100000");

        driver.findElement(By.id("continue")).click();

        driver.findElement(By.id("finish")).click();

        String completeMsg = driver.findElement(By.cssSelector("[data-test='complete-header']")).getText();
        assertTrue(completeMsg.contains("Thank you for your order!"));
    }
}
