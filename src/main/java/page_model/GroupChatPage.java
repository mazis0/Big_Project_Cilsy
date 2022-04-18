package page_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class GroupChatPage {
    WebDriver driver;

    @FindBy(xpath = "//div[@class=\"fr-element fr-view\"]/p")
    private WebElement textMessage;

    @FindBy(xpath = "//div[@class=\"CreateGroupMessage_actionSection__3kUoF\"]/button")
    private WebElement buttonSendMessage;

    @FindBy(xpath = "//div[@class=\"infinite-scroll-component \"]/div[1]//*[contains(text(),'muhammad azis')]")
    private WebElement labelMuhammadAzis;

    @FindBy(xpath = "//p[.=\"<p>Konten Website</p>\"]")
    private WebElement messageInjectHtml;

    @FindBy(xpath = "//div[@class=\"infinite-scroll-component \"]/div[1]//*[contains(text(),'test')]")
    private WebElement newMessagetest;

    @FindBy(xpath = "//div[@class=\"CreateGroupMessage_attachmentButton__i4UJs\"]/preceding-sibling::input")
    private WebElement attachFile;

    @FindBy(xpath = "//div[@class=\"infinite-scroll-component \"]/div[1]//*[contains(text(),'download.png')]")
    private WebElement fileNameDownload;

    @FindBy(xpath = "(//*[local-name()='svg'])[5]")
    private WebElement messageOption;

    @FindBy(xpath = "//div[@class=\"infinite-scroll-component \"]/div[1]//div[@class=\"OverlayButton_box__2jFLd\"]")
    private WebElement labelDeleteMessage;

    @FindBy(xpath = "//button[@class=\"btn btn-danger btn-block btn-sm\"]")
    private WebElement buttonDelete;

    @FindBy(xpath = "//div[@class=\"infinite-scroll-component \"]/div[1]//*[contains(text(),'This message was deleted')]")
    private WebElement deleteMessage;

    @FindBy(xpath = "//div[@class=\"infinite-scroll-component \"]/div[1]/div/div[1]")
    private WebElement labelFirstMessage;

    @FindBy(xpath = "//*[contains(text(),'Format file not allowed.')]")
    private WebElement messageFormatFileNotAllowed;

    public GroupChatPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
        this.driver=driver;
    }

    public void inputMessage(String message){
        textMessage.sendKeys(message);
    }

    public void clickOnButtonSend(){
        buttonSendMessage.click();
    }
    public boolean verifySendMessage(){
        newMessagetest.isDisplayed();
        labelMuhammadAzis.isDisplayed();
        return true;
    }

    public void attachFile()throws InterruptedException{
        String filePath = System.getProperty("user.dir") + "\\file\\download.png";
        attachFile.sendKeys(filePath);
        Thread.sleep(3000);
    }

    public void attachFileExe()throws InterruptedException{
        String filePath = System.getProperty("user.dir") + "\\file\\download.exe";
        attachFile.sendKeys(filePath);
        Thread.sleep(3000);
    }
    public boolean verifyAttachedFile(){
        fileNameDownload.isDisplayed();
        return true;
    }

    public void clickOnMessageOption()throws InterruptedException{
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(labelMuhammadAzis).build().perform();
        Thread.sleep(2000);
        actions.moveToElement(messageOption).click().build().perform();

//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("arguments[0].click();",messageOption);

    }
    public void clickOnLabelDeleteMessage()throws InterruptedException{
        Thread.sleep(3000);
        labelDeleteMessage.click();
    }
    public void clickOnButtonDelete()throws InterruptedException{
        Thread.sleep(3000);
        buttonDelete.click();
    }

    public String DeleteMessage()throws InterruptedException{
        Thread.sleep(3000);
        return deleteMessage.getText();
    }
    public String messageFormatFileNotAllowed(){
        return messageFormatFileNotAllowed.getText();
    }


    public boolean isMessageInjectHtmlDisplayed(){
        messageInjectHtml.isDisplayed();
        return true;
    }
}
