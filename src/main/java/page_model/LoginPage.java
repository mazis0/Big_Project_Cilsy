package page_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;

    @FindBy(xpath = "//div[.=\"Login with Google Account\"]")
    private WebElement labelLoginWithGoogleAccount;
    @FindBy(xpath = "//input[@id=\"identifierId\"]")
    private WebElement textEmail;
    @FindBy(xpath = "//span[.=\"Berikutnya\"]")
    private WebElement buttonBerikutnya;
    @FindBy(xpath = "//input[@type=\"password\"]")
    private WebElement textPassword;
    @FindBy(xpath = "//p[.=\"COMPANY\"]")
    private WebElement labelCompany;
    @FindBy(xpath = "//h1[.=\"Welcome aboard!\"]")
    private WebElement labelWelcomeAboard;
    @FindBy (xpath = "//img[@class=\"AuthPage_AuthPage__leftSection__illustration__1lyBq\"]")
    private WebElement imageLoginPage;
    @FindBy(xpath = "//p[.=\"Login with Apple ID\"]")
    private WebElement loginWithAppleID;
    @FindBy(xpath = "//div[@class=\"o6cuMc\"]")
    private WebElement errorMessageInvalidEmail;
    @FindBy(xpath = "//span[.=\"Sandi salah. Coba lagi atau klik Lupa sandi untuk mereset.\"]")
    private WebElement errorMessageInvalidPassword;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        this.driver=driver;
    }
    public boolean verifyLoginPage(){
    labelWelcomeAboard.isDisplayed();
    imageLoginPage.isDisplayed();
    labelLoginWithGoogleAccount.isDisplayed();
    loginWithAppleID.isDisplayed();
    return true;
    }
    public void clickOnLabelLoginWithGoogleAccount(){
        labelLoginWithGoogleAccount.click();
    }
    public void inputEmail(String email){
        textEmail.sendKeys(email);
    }
    public void clickOnBerikutnyaButton()throws InterruptedException{

        buttonBerikutnya.click();
        Thread.sleep(2000);
    }
    public void inputPassword(String password){

        textPassword.sendKeys(password);
    }
    public boolean verifyLabelCompany(){
         labelCompany.isDisplayed();
         return true;
    }
    public String errorMessageInvalidEmail(){
        return errorMessageInvalidEmail.getText();
    }
    public String errorMessageInvalidPassword(){
        return errorMessageInvalidPassword.getText();
    }
}
