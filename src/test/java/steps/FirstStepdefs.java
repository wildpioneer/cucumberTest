package steps;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;

public class FirstStepdefs extends BaseUtil {
    private BaseUtil baseUtil;

    public FirstStepdefs(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;
    }

    @Given("browser is started")
    public void browserIsStarted() {
    }

    @When("login page is opened")
    public void loginPageIsOpened() {
        baseUtil.Driver.get("https://aqa5master1.testrail.io");
    }

    @Then("username field is displayed")
    public void usernameFieldIsDisplayed() {
        LoginPage loginPage = new LoginPage(baseUtil.Driver);
        Assert.assertTrue(loginPage.getUsernameField().isDisplayed());
    }
}
