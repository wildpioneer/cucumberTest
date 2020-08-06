package steps;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.DashboardPage;
import pages.LoginPage;

public class SecondStepdefs extends BaseUtil {
    private BaseUtil baseUtil;

    public SecondStepdefs(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;
    }

    @When("user logged in")
    public void userLoggedIn() {
        LoginPage loginPage = new LoginPage(baseUtil.Driver);
        loginPage.login("atrostyanko+master@gmail.com", "QqtRK9elseEfAk6ilYcJ");
    }

    @Then("add project button is displayed")
    public void addProjectButtonIsDisplayed() {
        DashboardPage dashboardPage = new DashboardPage(baseUtil.Driver);
        Assert.assertTrue(dashboardPage.getAddProjectButton().isDisplayed());
    }

    @When("user {string} with password {string} logged in")
    public void userWithPasswordLoggedIn(String username, String password) {
        LoginPage loginPage = new LoginPage(baseUtil.Driver);
        loginPage.login(username, password);
    }

    @And("username is {string}")
    public void usernameIs(String text) {
        Assert.assertEquals(new DashboardPage(baseUtil.Driver).getVisibleUsername(), text);
    }
}
