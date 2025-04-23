package com.cmcglobal.Exercise.Baitap8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventoryPage {
    private WebDriver driver;

    private By productList = By.className("inventory_item");
    private By pageTitle = By.className("title");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getAllProducts() {
        return driver.findElements(productList);
    }

    public String getTitleText() {
        return driver.findElement(pageTitle).getText();
    }

    public boolean isOnInventoryPage() {
        return driver.getCurrentUrl().contains("inventory");
    }
}
