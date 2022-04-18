package page_model;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SchedulePage {
    WebDriver driver;
    @FindBy(xpath = "//button[.=\"+ Create Event!\"]")
    private WebElement labelCreateEvent;

    @FindBy(xpath = "//div[@class=\"CreateEventPage_eventsSection__title__SYZ_I\"]/child::input")
    private WebElement textEventTitle;

    @FindBy(xpath = "//input[@id=\"date-picker-dialog-start\"]")
    private WebElement startDate;

    @FindBy(xpath = "//div[@class=\"CreateEventPage_eventsSection__schedule__3tdog\"]/div[1]/div[2]/div[2]//input")
    private WebElement startTime;

    @FindBy(xpath = "//input[@id=\"date-picker-dialog-end\"]")
    private WebElement endDate;

    @FindBy(xpath = "//div[@class=\"CreateEventPage_eventsSection__schedule__3tdog\"]/div[2]/div[2]/div[2]//input")
    private WebElement endTime;

    @FindBy(xpath = "(//*[local-name()='svg'])[15]")
    private WebElement symbolPlusWith;

    @FindBy(xpath = "//span[@class=\"MuiSwitch-root\"]")
    private WebElement sliderPrivate;

    @FindBy(xpath = "//div[@class=\"fr-element fr-view\"]")
    private WebElement textNotes;

    @FindBy(xpath = "//button[@class=\"btn btn-success\"]")
    private WebElement buttonPostEvent;

    @FindBy(xpath = "//div[@class=\"ManageSubscribersContainer_ManageSubscribersContainer__body__3lbqx\"]/div[11]")
    private WebElement labelMuhammadAzis;

    @FindBy(xpath = "//button[@class=\"btn btn-danger\"]")
    private WebElement buttonCancel;

    @FindBy(xpath = "//div[@class=\"tribute-container\"]/ul/li[11]")
    private WebElement mentionMuhammadAzis;

    @FindBy(xpath = "//div[@class=\"MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiInputBase-input MuiInput-input\"]")
    private WebElement labelRepeat;

    @FindBy(xpath = "//ul[@class=\"MuiList-root MuiMenu-list MuiList-padding\"]/li[1]")
    private WebElement labelDontRepeat;

    @FindBy(xpath = "//ul[@class=\"MuiList-root MuiMenu-list MuiList-padding\"]/li[2]")
    private WebElement labelEveryDay;

    @FindBy(xpath = "//ul[@class=\"MuiList-root MuiMenu-list MuiList-padding\"]/li[3]")
    private WebElement labelEveryWeek;

    @FindBy(xpath = "//ul[@class=\"MuiList-root MuiMenu-list MuiList-padding\"]/li[4]")
    private WebElement labelEveryQuarter;

    @FindBy(xpath = "//ul[@class=\"MuiList-root MuiMenu-list MuiList-padding\"]/li[5]")
    private WebElement labelEveryYear;

    @FindBy(xpath = "//ul[@class=\"MuiList-root MuiMenu-list MuiList-padding\"]/li[6]")
    private WebElement labelEveryWeekDayMondayUntilFriday;

    @FindBy(xpath = "//ul[@class=\"MuiList-root MuiMenu-list MuiList-padding\"]/li[7]")
    private WebElement labelEveryMonth;

    @FindBy(xpath = "//*[contains(text(),'Create event successful')]")
    private WebElement successMessage;

    @FindBy(xpath = "//*[contains(text(),'Event title cannot be empty')]")
    private WebElement errorMessageEmptyTitleEvent;

    @FindBy(xpath = "(//*[local-name()='svg'])[16]")
    private WebElement closeWith;

    @FindBy(xpath = "//*[contains(text(),'Create recurring occurrence successful')]")
    private WebElement messageCreaterecurringoccurrencesuccessful;

    @FindBy(xpath = "//*[contains(text(),'Cannot choose end date time before start date time')]")
    private WebElement errorMessageClearEndsDate;

    @FindBy(xpath = "//input[@id=\"date-picker-dialog-end\"]/parent::div/parent::div/parent::div/div[2]//input")
    private WebElement timeEnds;



    public SchedulePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
        this.driver=driver;
    }

    public void clickOnLabelCreateEvent(){
        labelCreateEvent.click();
    }
    public void inputEventTitle(String title){
        textEventTitle.sendKeys(title);
    }
    public void startDateTime(String date)throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.moveToElement(startDate).click().build().perform();
        actions.sendKeys(Keys.BACK_SPACE).build().perform();
        actions.sendKeys(Keys.BACK_SPACE).build().perform();
        actions.sendKeys(Keys.BACK_SPACE).build().perform();
        actions.sendKeys(Keys.BACK_SPACE).build().perform();
        actions.sendKeys(Keys.BACK_SPACE).build().perform();
        actions.sendKeys(Keys.BACK_SPACE).build().perform();
        actions.sendKeys(Keys.BACK_SPACE).build().perform();
        actions.sendKeys(Keys.BACK_SPACE).build().perform();
        startDate.sendKeys(date);
        actions.moveToElement(startTime).click().build().perform();
    }
    public void endDateTime(String date)throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.moveToElement(endDate).click().build().perform();
        actions.sendKeys(Keys.BACK_SPACE).build().perform();
        actions.sendKeys(Keys.BACK_SPACE).build().perform();
        actions.sendKeys(Keys.BACK_SPACE).build().perform();
        actions.sendKeys(Keys.BACK_SPACE).build().perform();
        actions.sendKeys(Keys.BACK_SPACE).build().perform();
        actions.sendKeys(Keys.BACK_SPACE).build().perform();
        actions.sendKeys(Keys.BACK_SPACE).build().perform();
        actions.sendKeys(Keys.BACK_SPACE).build().perform();
        endDate.sendKeys(date);
        Thread.sleep(3000);
    }
    public void selectMuhammadAzis(){
        symbolPlusWith.click();
        labelMuhammadAzis.click();
        closeWith.click();
    }
    public void clickOnSymbolPlusWith(){
        symbolPlusWith.click();
    }
    public void slidePrivate(){
        sliderPrivate.click();
    }
    public void inputTextNotes(String notes){
        textNotes.sendKeys(notes);
    }
    public void clickOnButtonPostEvent()throws InterruptedException{
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(buttonPostEvent).click().build().perform();

    }
    public void clickOnCancelButton(){
        buttonCancel.click();
    }
    public String getTitle(){
        return driver.getTitle();
    }
    public void selectDontRepeat(){
        labelRepeat.click();
        labelDontRepeat.click();
    }

    public void selectEveryDay(){
        labelRepeat.click();
        labelEveryDay.click();
    }
    public void selectEveryWeek(){
        labelRepeat.click();
        labelEveryWeek.click();
    }
    public void selectEveryQuarter(){
        labelRepeat.click();
        labelEveryQuarter.click();
    }
    public void selectEveryYear(){
        labelRepeat.click();
        labelEveryYear.click();
    }
    public void selectEveryWeekday(){
        labelRepeat.click();
        labelEveryWeekDayMondayUntilFriday.click();
    }
    public void selectEveryMonth(){
        labelRepeat.click();
        labelEveryMonth.click();
    }
    public void inputTextNotesWithMention()throws InterruptedException{
        textNotes.sendKeys("@");
        Thread.sleep(2000);
        mentionMuhammadAzis.click();
    }
    public String getSuccessMessage()throws InterruptedException{
        Thread.sleep(11000);
        return successMessage.getText();
    }
    public String getErrorMessage()throws InterruptedException{
        Thread.sleep(3000);
        return errorMessageEmptyTitleEvent.getText();
    }
    public String getmessageCreaterecurringoccurrencesuccessful(){
        return messageCreaterecurringoccurrencesuccessful.getText();
    }

    public void clearEndDateTime() {
        Actions actions = new Actions(driver);
        actions.moveToElement(endDate).click().build().perform();
        actions.sendKeys(Keys.BACK_SPACE).build().perform();
        actions.sendKeys(Keys.BACK_SPACE).build().perform();
        actions.sendKeys(Keys.BACK_SPACE).build().perform();
        actions.sendKeys(Keys.BACK_SPACE).build().perform();
        actions.sendKeys(Keys.BACK_SPACE).build().perform();
        actions.sendKeys(Keys.BACK_SPACE).build().perform();
        actions.sendKeys(Keys.BACK_SPACE).build().perform();
        actions.sendKeys(Keys.BACK_SPACE).build().perform();
    }

    public boolean isErrorMessageCannotchooseenddatetimebeforestartdatetimeDisplayed(){
        errorMessageClearEndsDate.isDisplayed();
        return true;
    }

    public void setEndsTime(String endsTime)throws InterruptedException{
//        String actual = timeEnds.getAttribute("value");
//        String expected = "";
        timeEnds.sendKeys(Keys.CONTROL + "A"+Keys.BACK_SPACE);
        timeEnds.sendKeys(endsTime);
        Thread.sleep(5000);
    }

    public boolean isEndsDateisChanged(String expected){
        String actual = endDate.getAttribute("value");
        Assert.assertEquals(expected,actual);
        return true;

    }






}
