package page_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class BoardPage {
    WebDriver driver;

    @FindBy(xpath = "//button[@class=\"btn btn-outline-dark btn-block btn-sm\"]")
    private WebElement labelAddList;

    @FindBy(xpath = "//input[@class=\"form-control\"]")
    private WebElement textListName;

    @FindBy(xpath = "//button[@class=\"btn btn-success btn-sm\"]")
    private WebElement buttonCreate;

    @FindBy(xpath = "//*[contains(text(),'Creating list is success')]")
    private WebElement labelCreatingListIsSuccess;

    @FindBy(xpath = "//h1[.=\"Testing40\"]/parent::div/parent::div/following-sibling::div")
    private WebElement optionMorePoint3CardTesting5;

    @FindBy(xpath = "//p[.=\"Archive This List\"]")
    private WebElement labelArchiveThisList;

    @FindBy(xpath = "//*[contains(text(),'Testing40 list has been moved to archived')]")
    private WebElement labelTestingListHasBeenMovedToArchive;

    @FindBy(xpath = "//p[.=\"Archived Items\"]")
    private WebElement labelArchivedItems;

    @FindBy(xpath = "//button[@class=\"btn btn-dark btn-sm\"]")
    private WebElement buttonSwithToList;

    @FindBy(xpath = "//p[.=\"Testing40\"]/parent::div/parent::div/div[2]")
    private WebElement buttonRestoreTesting5;

    @FindBy(xpath = "//*[contains(text(),'Unarchiving list with cards is success')]")
    private WebElement labelUnarchivingListWithCardsIsSuccess;

    @FindBy(xpath = "//h1[.=\"Testing10\"]/parent::div/parent::div/parent::div/parent::div/div[4]")
    private WebElement labelAddToCardOnTesting10;

    @FindBy(xpath = "//input[@placeholder=\"Card name\"]")
    private WebElement textCardName;

    @FindBy(xpath = "//button[@class=\"btn btn-success btn-sm\"]")
    private WebElement buttonAddCard;

    @FindBy(xpath = "//*[contains(text(),'Creating card is success')]")
    private WebElement labelCreatingCardIsSuccess;

    @FindBy(xpath = "//a[@href=\"/cards/62511bf0e1a7f4d4fe2c5caa\"]")
    private WebElement cardTesting20OnTesting10List;

    @FindBy(xpath = "//*[contains(text(),'Members')]/parent::button")
    private WebElement buttonMembers;

    @FindBy(xpath = "//*[contains(text(),'Labels')]/parent::button")
    private WebElement buttonLabels;

    @FindBy(xpath = "//*[contains(text(),'Attach File')]/parent::button")
    private WebElement buttonAttachFile;

    @FindBy(xpath = "//*[contains(text(),'Private Card')]/parent::button")
    private WebElement buttonPrivateCard;

    @FindBy(xpath = "//*[contains(text(),'Archive')]/parent::button")
    private WebElement buttonArchive;

    @FindBy(xpath = "(//*[local-name()='svg'])[12]")
    private WebElement editCard;

    @FindBy(xpath = "//p[.=\"Quick Comment\"]")
    private WebElement labelQuickComment;

    @FindBy(xpath = "//p[.=\"Change Name\"]/parent::div")
    private WebElement labelChangeName;

    @FindBy(xpath = "//p[.=\"Attach Files\"]/parent::div")
    private WebElement labelAttachFiles;

    @FindBy(xpath = "//p[.=\"Edit Notes\"]/parent::div")
    private WebElement labelEditNotes;

    @FindBy(xpath = "//input[@name=\"name\"]")
    private WebElement textChangeName;

    @FindBy(xpath = "//button[@class=\"btn btn-success btn-sm\"]")
    private WebElement buttonSave;

    @FindBy(xpath = "//*[contains(text(),'Update card is success')]")
    private WebElement updateCardName;

    @FindBy(xpath = "//div[@class=\"CreateCommentForm_inputComment__2G2m9\"]")
    private WebElement boxComment;

    @FindBy(xpath = "//div[@class=\"fr-element fr-view\"]")
    private WebElement textQuickComment;

    @FindBy(xpath = "//*[contains(text(),'Create comment is success')]")
    private WebElement labelCreateCommentIsSuccess;

    @FindBy(xpath = "//p[.=\"Attach Files\"]/parent::div/preceding-sibling::input")
    private WebElement attachFile;

    @FindBy(xpath = "//*[contains(text(),'Upload attachments is success')]")
    private WebElement messageSuccessUpload;

    @FindBy(xpath = "//div[@class=\"ManageMembersContainer_ManageMembersContainer__body__1skzm\"]/div[8]")
    private WebElement memberMuhammadAzis1;

    @FindBy(xpath = "//div[@class=\"ManageMembersContainer_ManageMembersContainer__body__1skzm\"]/div[11]")
    private WebElement memberMuhammadAzis2;

    @FindBy(xpath = "//*[contains(text(),'Change Members')]")
    private WebElement labelChangeMember;

    @FindBy(xpath = "//*[contains(text(),'toggle member card is success')]")
    private WebElement messageSuccessToggleMember;

    @FindBy(xpath = "//a[@href=\"/cards/625107c1e6338f76150589f3\"]/parent::div")
    private WebElement labelCardTest;

    @FindBy(xpath = "//a[@href=\"/cards/62511bf0e1a7f4d4fe2c5caa\"]/parent::div")
    private WebElement labelCardTest2;




    public BoardPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        this.driver=driver;
    }
    public void clickOnLabelAddList(){
        labelAddList.click();
    }
    public void inputListName(String listName){
        textListName.sendKeys(listName);
    }
    public void clickOnCreate(){
        buttonCreate.click();
    }
    public boolean isCreatingListIsSuccessDisplayed()throws InterruptedException{
        Thread.sleep(2000);
        labelCreatingListIsSuccess.isDisplayed();
        return true;
    }
    public void clickOn3PointOption(){
        optionMorePoint3CardTesting5.click();
    }
    public void clickOnLabelArchiveThisList(){
        labelArchiveThisList.click();
    }
    public void clickOnLabelArchiveItems(){
        labelArchivedItems.click();
    }
    public void clickOnButtonSwithTo(){
        buttonSwithToList.click();
    }
    public void clickOnButtonRestoreTesting5(){
        buttonRestoreTesting5.click();
    }
    public String messageTestingListHasBeenMovedToArchive()throws InterruptedException{
        Thread.sleep(2000);
        return labelTestingListHasBeenMovedToArchive.getText();
    }
    public String messageUnarchivingListWithCardsIsSuccess()throws InterruptedException{
        Thread.sleep(2000);
        return labelUnarchivingListWithCardsIsSuccess.getText();
    }
    public void clickOnlabelAddToCardOnTesting10(){
        labelAddToCardOnTesting10.click();
    }
    public void inputCardName(String cardname){
        textCardName.sendKeys(cardname);
    }
    public void clickOnAddCard(){
        buttonAddCard.click();
    }
    public String messageCreatingCardIsSuccess()throws InterruptedException{
        Thread.sleep(2000);
        return labelCreatingCardIsSuccess.getText();
    }

    public void clickOnEditCardNameButton(){
        Actions actions = new Actions(driver);
        actions.moveToElement(cardTesting20OnTesting10List).build().perform();
        actions.moveToElement(editCard).click().build().perform();
    }
    public void clickOnChangeName(){
        labelChangeName.click();
    }
    public void textCardName(String cardname){
        textChangeName.clear();
        textChangeName.sendKeys(cardname);
    }
    public void clickOnSaveChangeName(){
        buttonSave.click();
    }
    public String messageUpdatecardissuccess()throws InterruptedException{
        Thread.sleep(3000);
        return updateCardName.getText();
    }
    public void labelQuickComment()throws InterruptedException{
        Actions actions = new Actions(driver);
        actions.moveToElement(labelQuickComment).doubleClick().build().perform();
        actions.moveToElement(labelQuickComment).doubleClick().build().perform();

    }
    public void clickOnTextComment()throws InterruptedException{
        Thread.sleep(6000);
        boxComment.click();
    }
    public void textQuickComment(String comment){
        textQuickComment.clear();
        textQuickComment.sendKeys(comment);
    }
    public void clickOnButtonSaveQuickComment(){
        buttonSave.click();
    }
    public String messageCreateCommentIsSuccess()throws InterruptedException{
        Thread.sleep(3000);
        return labelCreateCommentIsSuccess.getText();
    }
    public void editNotes(){
        Actions actions = new Actions(driver);
        actions.moveToElement(labelEditNotes).doubleClick().build().perform();
        actions.moveToElement(labelEditNotes).doubleClick().build().perform();
    }
    public void textNotes(String notes){
        textQuickComment.clear();
        textQuickComment.sendKeys(notes);
    }
    public void saveNotes(){
        buttonSave.click();
    }
    public void attachFile()throws InterruptedException{
        String filePath = System.getProperty("user.dir") + "\\file\\download.png";
        attachFile.sendKeys(filePath);
        Thread.sleep(2000);
    }

    public String messageSuccessUpload()throws InterruptedException{
        Thread.sleep(2000);
        return messageSuccessUpload.getText();
    }

    public void clickOnLabelChangeMember(){
        labelChangeMember.click();
    }

    public void selectMember(){
        memberMuhammadAzis1.click();
    }
    public String messagetogglemembercardissuccess()throws InterruptedException{
        Thread.sleep(2000);
        return messageSuccessToggleMember.getText();
    }

    public void dragNDrop()throws InterruptedException{
//        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(labelCardTest,labelCardTest2).build().perform();
//        System.out.println(labelCardTest2.getLocation());
    }


}
