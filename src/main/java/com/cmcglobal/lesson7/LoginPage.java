package com.cmcglobal.lesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    private String username;
    private  String password;

    public LoginPage(String username, String password){
        this.username = username;
        this.password = password;
    }

    public LoginPage doLogin() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://hrms.cmcglobal.com.vn/");
        Thread.sleep(500);
        driver.findElement(By.id("normal_login_username")).sendKeys(username);
        driver.findElement(By.id("normal_login_password")).sendKeys(password);
        return this;
    }

    public String getUsername(){
        return username;
    }

}
