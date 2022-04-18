package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page_model.GroupChatPage;
import page_model.PaketSoalBPage;

public class GroupChatStep {

    WebDriver driver;
    public GroupChatStep(){
        super();
        this.driver=Hooks.driver;
    }

    @Given("Click On Group Chat")
    public void click_on_group_chat() {
        PaketSoalBPage paketSoalBPage = new PaketSoalBPage(driver);
        paketSoalBPage.clickOnGroupChat();
    }

    @Given("Send message as {string}")
    public void send_message_as(String message) {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        groupChatPage.inputMessage(message);
    }

    @Given("Attach file name as {string}")
    public void attachFile(String filename) throws InterruptedException{
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        if(filename.equals("download.png")){
            groupChatPage.attachFile();
        }else if(filename.equals("download.exe")){
            groupChatPage.attachFileExe();
        }

    }

    @When("User Click on send button")
    public void user_click_on_send_button() {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        groupChatPage.clickOnButtonSend();
    }

    @Then("Verify that message {string} successfully sended")
    public void verify_that_message_successfully_sended(String message) {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        if(message.equals("test")){
            Assert.assertTrue(groupChatPage.verifySendMessage());
        }else if(message.equals("<p>Konten Website</p>")){
            Assert.assertTrue(groupChatPage.isMessageInjectHtmlDisplayed());
        }

    }

    @Then("Success attached message as {string} should be displayed")
    public void verifyFileDownloadSuccesfullyAttached(String message) {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        if(message.equals("Upload attachments is success")){
            Assert.assertTrue(groupChatPage.verifyAttachedFile());
        }else{
            Assert.assertEquals(message,groupChatPage.messageFormatFileNotAllowed());
        }

    }
    @Given("Click On message option")
    public void click_on_message_option() throws InterruptedException{
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        groupChatPage.clickOnMessageOption();
    }
    @Given("Click On Label Delete Message")
    public void click_on_label_delete_message() throws InterruptedException{
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        groupChatPage.clickOnLabelDeleteMessage();
    }
    @When("Click On Delete Button")
    public void click_on_delete_button() throws InterruptedException{
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        groupChatPage.clickOnButtonDelete();
    }
    @Then("Verify that delete message as {string} is displayed")
    public void verify_that_delete_message_as_is_displayed(String message)throws InterruptedException {
        GroupChatPage groupChatPage = new GroupChatPage(driver);
        Assert.assertEquals(message,groupChatPage.DeleteMessage());
    }
}
