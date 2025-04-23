package com.cmcglobal.Exercise.Baitap7;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DisappearingElements4 extends OpenWeb{
    @Test
    public void homeLink_shouldBeVisible() {
        driver.get("https://the-internet.herokuapp.com/disappearing_elements");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        boolean found = links.stream().anyMatch(link -> link.getText().equals("Home"));

        assertTrue(found);
    }

    @Test
    public void aboutLink_shouldBeVisible() {
        driver.get("https://the-internet.herokuapp.com/disappearing_elements");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        boolean found = links.stream().anyMatch(link -> link.getText().equals("About"));

        assertTrue(found);
    }
}
