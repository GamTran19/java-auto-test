package com.cmcglobal.Exercise.BaiTap9.Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PIMPage {

    private WebDriver driver;
    private WebDriverWait wait;

    // Định nghĩa các phần tử
    private By pimMenu = By.xpath("//span[text()='PIM']");
    private By employeeNameField = By.xpath("//input[@placeholder='Type for hints...']");
    private By searchButton = By.xpath("//button[@type='submit']");
    private By resultTable = By.cssSelector(".orangehrm-container");

    // Constructor
    public PIMPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Điều hướng vào mục PIM
    public void navigateToPIM() {
        WebElement pimTab = wait.until(ExpectedConditions.visibilityOfElementLocated(pimMenu));
        pimTab.click();
    }

    // Nhập tên nhân viên cần tìm
    public void enterEmployeeName(String name) {
        WebElement nameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(employeeNameField));
        nameInput.clear();
        nameInput.sendKeys(name);
    }

    // Nhấn nút tìm kiếm
    public void clickSearch() {
        WebElement searchBtn = wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        searchBtn.click();
    }

    // Tìm nhân viên theo tên – gọi gộp
    public void searchEmployeeByName(String name) {
        navigateToPIM();
        enterEmployeeName(name);
        clickSearch();
    }

    // Kiểm tra có hiển thị kết quả bảng danh sách nhân viên không
    public boolean isSearchResultVisible() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(resultTable)).isDisplayed();
    }
}
