package page_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage {
    WebDriver driver;

    @FindBy(xpath = "//a[@class=\"LinkNoDecor_Link__3DEkL\"]")
    private WebElement labelPaketSoalB;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        this.driver=driver;
    }

    public void clickOnPaketSoalB(){
        labelPaketSoalB.click();
    }
}
