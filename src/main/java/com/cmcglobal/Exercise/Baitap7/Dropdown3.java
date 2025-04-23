package com.cmcglobal.Exercise.Baitap7;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Dropdown3 extends OpenWeb{
    @Test
    public void selectOption1_shouldBeSelected() {
        driver.get("https://the-internet.herokuapp.com/dropdown");

        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
        dropdown.selectByVisibleText("Option 1");

        assertEquals("Option 1", dropdown.getFirstSelectedOption().getText());
    }

    @Test
    public void selectOption2_shouldBeSelected() {
        driver.get("https://the-internet.herokuapp.com/dropdown");

        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
        dropdown.selectByValue("2");

        assertEquals("Option 2", dropdown.getFirstSelectedOption().getText());
    }
}
