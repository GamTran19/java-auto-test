package com.cmcglobal.Exercise.Baitap7;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicLoading2 extends OpenWeb {

    @Test
    public void dynamicLoadExample1_shouldShowHelloWorld() {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        driver.findElement(By.tagName("button")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));

        String result = driver.findElement(By.id("finish")).getText();
        assertEquals("Hello World!", result);
    }

    @Test
    public void dynamicLoadExample2_shouldShowHelloWorld() {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        driver.findElement(By.tagName("button")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));

        String result = driver.findElement(By.id("finish")).getText();
        assertEquals("Hello World!", result);
    }
}
