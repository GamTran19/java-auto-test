package com.cmcglobal.Exercise.Baitap7;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddRemoveElements6 extends OpenWeb{
    @Test
    public void addButton_shouldAddDeleteButton() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        driver.findElement(By.xpath("//button[text()='Add Element']")).click();

        List<WebElement> deleteButtons = driver.findElements(By.className("added-manually"));
        assertEquals(1, deleteButtons.size());
    }

    @Test
    public void deleteButton_shouldRemoveElement() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.className("added-manually")).click();

        List<WebElement> deleteButtons = driver.findElements(By.className("added-manually"));
        assertEquals(0, deleteButtons.size());
    }
}
