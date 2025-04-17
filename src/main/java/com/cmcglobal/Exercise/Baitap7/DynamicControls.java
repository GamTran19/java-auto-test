package com.cmcglobal.Exercise.Baitap7;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DynamicControls extends OpenWeb{
    @Test
    public void removeCheckbox() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement checkbox = driver.findElement(By.id("checkbox"));
        assertTrue(checkbox.isDisplayed());

        driver.findElement(By.xpath("//button[text()='Remove']")).click();
        WebElement message = driver.findElement(By.id("message"));
        assertTrue(message.getText().contains("It's gone!"));
    }
    @Test
    public void enableInput_shouldBeEditable() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement inputField = driver.findElement(By.cssSelector("input[type='text']"));
        assertFalse(inputField.isEnabled()); // Ban đầu bị disable

        driver.findElement(By.xpath("//button[text()='Enable']")).click();
        WebElement message = driver.findElement(By.id("message"));
        assertTrue(message.getText().contains("It's enabled!"));
    }
}
