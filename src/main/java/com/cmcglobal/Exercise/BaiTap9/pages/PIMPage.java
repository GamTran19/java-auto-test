package com.cmcglobal.Exercise.BaiTap9.pages;

import com.cmcglobal.Exercise.BaiTap9.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PIMPage extends BasePage {


    // Định nghĩa các phần tử
    private final By pimMenu = By.xpath("//span[text()='PIM']");
    private final By employeeNameField = By.xpath("//input[@placeholder='Type for hints...']");
    private final By searchButton = By.xpath("//button[@type='submit']");
    private final By resultTable = By.cssSelector(".orangehrm-container");

    private final By addButton = By.xpath("//button[normalize-space()='Add']");
    private final By firstNameInput = By.name("firstName");
    private final By lastNameInput = By.name("lastName");
    private final By saveButton = By.xpath("//button[normalize-space()='Save']");
    private final By personalDetailsHeader = By.xpath("//h6[text()='Personal Details']");

    // Constructor
    public PIMPage(WebDriver driver) {
        super(driver);
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

    public void clickAddButton() {
        click(addButton);
    }

    public void fillEmployeeForm(String firstName, String lastName) {
        type(firstNameInput, firstName);
        type(lastNameInput, lastName);
    }

    public void clickSave() {
        click(saveButton);
    }

    public boolean isPersonalDetailsPage() {
        return isDisplayed(personalDetailsHeader);
    }
}
