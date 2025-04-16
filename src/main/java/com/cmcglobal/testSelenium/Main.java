package com.cmcglobal.testSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Browser drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/watch?v=9cqNGd3dEE4");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();
    }
}
