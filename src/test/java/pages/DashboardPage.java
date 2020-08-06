package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import sun.usagetracker.UsageTrackerClient;

public class DashboardPage {
    private WebDriver driver;
    protected By ADDPROJECT = By.id("sidebar-projects-add");
    protected By USERNAME = By.className("navigation-username");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAddProjectButton() {
        return driver.findElement(ADDPROJECT);
    }

    public WebElement getUsernameLink() {
        return driver.findElement(USERNAME);
    }

    public String getVisibleUsername() {
        return getUsernameLink().getText();
    }
}
