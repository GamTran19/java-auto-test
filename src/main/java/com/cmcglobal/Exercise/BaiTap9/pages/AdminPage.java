package com.cmcglobal.Exercise.BaiTap9.pages;

import com.cmcglobal.Exercise.BaiTap9.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage extends BasePage {

    private final By addButton = By.xpath("//button[normalize-space()='Add']");
    private final By searchUsernameField = By.xpath("//label[text()='Username']/following::input[1]");
    private final By searchButton = By.xpath("//button[normalize-space()='Search']");
    private final By resetButton = By.xpath("//button[normalize-space()='Reset']");
    private final By saveButton = By.xpath("//button[normalize-space()='Save']");

    public AdminPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddButton() {
        click(addButton);
    }

    public void searchByUsername(String username) {
        type(searchUsernameField, username);
        click(searchButton);
    }

    public void clickResetButton() {
        click(resetButton);
    }

    public void clickEditForUser(String username) {
        By editIcon = By.xpath("//div[contains(text(),'" + username + "')]/parent::div/following-sibling::div//button[1]");
        click(editIcon);
    }

    public void clickDeleteForUser(String username) {
        By deleteIcon = By.xpath("//div[contains(text(),'" + username + "')]/parent::div/following-sibling::div//button[2]");
        click(deleteIcon);
    }

    public void confirmDelete() {
        By confirmBtn = By.xpath("//button[normalize-space()='Yes, Delete']");
        click(confirmBtn);
    }

    // ✅ Gộp fillForm (từ AddUserPage)
    public void fillUserForm(String empName, String username, String password) {
        By userRoleDropdown = By.xpath("//label[text()='User Role']/following::div[1]");
        By adminRoleOption = By.xpath("//div[@role='listbox']//span[text()='Admin']");

        By employeeNameInput = By.xpath("//input[@placeholder='Type for hints...']");
        By usernameInput = By.xpath("//label[text()='Username']/following::input[1]");
        By statusDropdown = By.xpath("//label[text()='Status']/following::div[1]");
        By enabledStatusOption =By.xpath("//div[@role='listbox']//span[text()='Enabled']");
        By passwordInput = By.xpath("//label[text()='Password']/following::input[1]");
        By confirmPasswordInput = By.xpath("//label[text()='Confirm Password']/following::input[1]");

        click(userRoleDropdown);
        waitForVisible(adminRoleOption);
        click(adminRoleOption);
        type(employeeNameInput, empName);
        type(usernameInput, username);
        waitForVisible(statusDropdown);
        click(statusDropdown);
        click(enabledStatusOption);
        type(passwordInput, password);
        type(confirmPasswordInput, password);
    }

    public void clickSave() {
        click(saveButton);
    }

    // ✅ Gộp changePassword (từ EditUserPage)
    public void changePassword(String password) {
        By passwordInput = By.xpath("//label[text()='Password']/following::input[1]");
        By confirmPasswordInput = By.xpath("//label[text()='Confirm Password']/following::input[1]");

        type(passwordInput, password);
        type(confirmPasswordInput, password);
        clickSave();
    }
}
