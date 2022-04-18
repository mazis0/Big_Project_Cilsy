package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page_model.LoginPage;

public class LoginStep {
    WebDriver driver;
    public LoginStep(){
        super();
        this.driver=Hooks.driver;
    }
    @Given("User is on Login Page")
    public void user_is_on_login_page() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyLoginPage();
    }
    @Given("Click on Login with Google Account")
    public void click_on_login_with_google_account() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickOnLabelLoginWithGoogleAccount();
    }
    @Given("Input email as {string}")
    public void input_email_as(String email) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputEmail(email);
    }
    @Given("Click on Berikutnya button")
    public void click_on_berikutnya_button() throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickOnBerikutnyaButton();
    }
    @Given("Input password as {string}")
    public void input_password_as(String password)throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputPassword(password);
    }
    @When("User Click on Berikutnya button")
    public void user_click_on_berikutnya_button() throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickOnBerikutnyaButton();
    }
    @Then("Verify label is displayed")
    public void verify_label_is_displayed() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyLabelCompany();
    }
    @Then("Error message invalid email as {string} should be displayed")
    public void errorMessageInvalidEmail(String errorMessage){
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertEquals(errorMessage,loginPage.errorMessageInvalidEmail());
    }
    @Then("Error message invalid password as {string} should be displayed")
    public void errorMessageInvalidPassword(String errorMessage){
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertEquals(errorMessage,loginPage.errorMessageInvalidPassword());
    }
}
