package page_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PaketSoalBPage {
    WebDriver driver;

    @FindBy(xpath = "//div[@class=\"TeamPage_rowBox__zylkg row\"]/div[1]")
    private WebElement labelGroupChat;

    @FindBy(xpath = "//div[@class=\"TeamPage_rowBox__zylkg row\"]/div[3]")
    private WebElement labelSchedule;

    @FindBy(xpath = "//div[@class=\"TeamPage_rowBox__zylkg row\"]/div[4]")
    private WebElement labelBoard;

    public PaketSoalBPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        this.driver=driver;
    }

    public void clickOnGroupChat(){
        labelGroupChat.click();
    }

    public void clickOnSchedule(){
        labelSchedule.click();
    }

    public void clickOnBoard(){
        labelBoard.click();

    }
}
