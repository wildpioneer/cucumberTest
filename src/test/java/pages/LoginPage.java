package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    private By USERNAME = By.id("name");
    private By PASSWORD = By.id("password");
    private By LOGIN = By.id("button_primary");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsernameField() {
        return driver.findElement(USERNAME);
    }
    public WebElement getPasswordField() {
        return driver.findElement(PASSWORD);
    }
    public WebElement getLoginButton() {
        return driver.findElement(LOGIN);
    }

    public void login(String username, String password) {
        getUsernameField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().submit();
    }
}
