package com.cmcglobal.Exercise.Baitap7;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavascriptAlerts5 extends OpenWeb {
    @Test
    public void acceptAlert_shouldConfirmText() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        String result = driver.findElement(By.id("result")).getText();
        assertEquals("You successfully clicked an alert", result);
    }

    @Test
    public void promptInput_shouldShowEnteredText() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Hello");
        alert.accept(); // bấm OK

        String result = driver.findElement(By.id("result")).getText();
        assertEquals("You entered: Hello", result);
    }

        @Test
        public void promptInput_shouldShowEnteredText2() {
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");

            driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
            Alert alert = driver.switchTo().alert();
            alert.sendKeys("Hello");
            alert.dismiss(); //Bấm Cancel

            String result = driver.findElement(By.id("result")).getText();
            assertEquals("You entered: null", result);
    }
}
