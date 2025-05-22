package com.cmcglobal.Exercise.BaiTap9.pages;

import com.cmcglobal.Exercise.BaiTap9.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashboardPage extends BasePage {
    private final By adminMenu = By.xpath("//span[text()='Admin']");
    private final By PIMMenu = By.xpath("//span[text()='PIM']");
    private final By leaveMenu = By.xpath("//span[text()='Leave']");
    private final By timeMenu = By.xpath("//span[text()='Time']");
    private final By recruitmentMenu = By.xpath("//span[text()='Recruitment']");
    private final By myInfoMenu = By.xpath("//span[text()='My Info']");
    private final By performanceMenu = By.xpath("//span[text()='Performance']");
    private final By dashboardMenu = By.xpath("//span[text()='Dashboard']");
    private final By directoryMenu = By.xpath("//span[text()='Directory']");
    private final By maintenanceMenu = By.xpath("//span[text()='Maintenance']");
    private final By claimMenu = By.xpath("//span[text()='Claim']");
    private final By buzzMenu = By.xpath("//span[text()='Buzz']");


    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public void goToAdminPage() {
        wait.until(ExpectedConditions.elementToBeClickable(adminMenu)).click();
    }

    public void goToPIMPage() {
        wait.until(ExpectedConditions.elementToBeClickable(PIMMenu)).click();
    }

    public void goToLeavePage() {
        wait.until(ExpectedConditions.elementToBeClickable(leaveMenu)).click();
    }

    public void goToTimePage() {
        wait.until(ExpectedConditions.elementToBeClickable(timeMenu)).click();
    }

    public void goToRecruitmentPage() {
        wait.until(ExpectedConditions.elementToBeClickable(recruitmentMenu)).click();
    }

    public void goToMyInfoPage() {
        wait.until(ExpectedConditions.elementToBeClickable(myInfoMenu)).click();
    }

    public void goToPerformancePage() {
        wait.until(ExpectedConditions.elementToBeClickable(performanceMenu)).click();
    }

    public void goToDashboardPage() {
        wait.until(ExpectedConditions.elementToBeClickable(dashboardMenu)).click();
    }

    public void goToDirectoryPage() {
        wait.until(ExpectedConditions.elementToBeClickable(directoryMenu)).click();
    }

    public void goToMaintenancePage() {
        wait.until(ExpectedConditions.elementToBeClickable(maintenanceMenu)).click();
    }

    public void goToClaimPage() {
        wait.until(ExpectedConditions.elementToBeClickable(claimMenu)).click();
    }

    public void goToBuzzPage() {
        wait.until(ExpectedConditions.elementToBeClickable(buzzMenu)).click();
    }
}
