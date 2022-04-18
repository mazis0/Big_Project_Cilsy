package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page_model.BoardPage;
import page_model.HomePage;
import page_model.PaketSoalBPage;

public class BoardStep {
    WebDriver driver;
    public BoardStep(){
        super();
        this.driver=Hooks.driver;
    }
    @Given("Click On Paket Soal B")
    public void click_on_paket_soal_b() {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnPaketSoalB();
    }

    @Given("Click On Board")
    public void click_on_board() {
        PaketSoalBPage paketSoalBPage = new PaketSoalBPage(driver);
        paketSoalBPage.clickOnBoard();
    }

    @Given("Click on add list")
    public void click_on_add_list() {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickOnLabelAddList();
    }

    @Given("Input list name as {string}")
    public void input_list_name_as(String listname) {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.inputListName(listname);
    }

    @When("User click on create")
    public void user_click_on_create() {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickOnCreate();
    }

    @Then("Successfully Create message should be displayed")
    public void successfully_create_message_should_be_displayed()throws InterruptedException {
        BoardPage boardPage = new BoardPage(driver);
        Assert.assertTrue(boardPage.isCreatingListIsSuccessDisplayed());
    }

    @Given("Click on point three on card Testing5")
    public void click_on_point_on_card_testing5() {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickOn3PointOption();
    }

    @When("Click on Archive this list")
    public void click_on_archive_this_list() {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickOnLabelArchiveThisList();
    }

    @Then("Success Archiving Message as {string} should be displayed")
    public void success_message_as_should_be_displayed(String message)throws InterruptedException {
        BoardPage boardPage = new BoardPage(driver);
        Assert.assertEquals(message,boardPage.messageTestingListHasBeenMovedToArchive());
    }
    @Given("Click on Archive Item")
    public void click_on_archive_item() {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickOnLabelArchiveItems();
    }
    @Given("Click on button Switch to lists")
    public void click_on_button_switch_to_lists() {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickOnButtonSwithTo();
    }
    @When("User click On restore Testing {int}")
    public void user_click_on_restore_testing(Integer int1) {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickOnButtonRestoreTesting5();
    }
    @Then("Success Unarchiving Message as {string} should be displayed")
    public void success_unarchiving_message_as_should_be_displayed(String message) throws InterruptedException{
        BoardPage boardPage = new BoardPage(driver);
        Assert.assertEquals(message,boardPage.messageUnarchivingListWithCardsIsSuccess());
    }

    @Given("Click add card On Testing10")
    public void click_add_card_on_testing10() {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickOnlabelAddToCardOnTesting10();
    }

    @Given("Input CardName as {string}")
    public void input_card_name_as(String cardname) {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.inputCardName(cardname);
    }

    @When("User click on Add Card")
    public void user_click_on_add_card() {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickOnAddCard();
    }

    @Then("Success Add card Message as {string} should be displayed")
    public void success_add_card_message_as_should_be_displayed(String message)throws InterruptedException {
        BoardPage boardPage = new BoardPage(driver);
        Assert.assertEquals(message,boardPage.messageCreatingCardIsSuccess());
    }
    @Given("Click on edit on card Testing20")
    public void click_on_edit_on_card_testing20() {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickOnEditCardNameButton();
    }

    @Given("Click On label change name")
    public void click_on_label_change_name() {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickOnChangeName();
    }

    @Given("Text card name as {string}")
    public void text_card_name_as(String message) {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.textCardName(message);
    }

    @When("User click on Save")
    public void user_click_on_save() {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickOnSaveChangeName();
    }

    @Then("Success save Message as {string} should be displayed")
    public void success_save_message_as_should_be_displayed(String message)throws InterruptedException {
        BoardPage boardPage = new BoardPage(driver);
        Assert.assertEquals(message,boardPage.messageUpdatecardissuccess());
    }
    @Given("Click On label Quick Comment")
    public void click_on_label_quick_comment()throws InterruptedException {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.labelQuickComment();
    }

    @Given("Click on box comment")
    public void click_on_box_comment()throws InterruptedException {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickOnTextComment();
    }

    @Given("Text Quick comment as {string}")
    public void text_quick_comment_as(String comment) {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.textQuickComment(comment);
    }

    @When("User click on Save Quick Comment")
    public void user_click_on_save_quick_comment() {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickOnButtonSaveQuickComment();
    }

    @Then("Success Comment Message as {string} should be displayed")
    public void success_comment_message_as_should_be_displayed(String message)throws InterruptedException {
        BoardPage boardPage = new BoardPage(driver);
        Assert.assertEquals(message,boardPage.messageCreateCommentIsSuccess());
    }
    @Given("Click On label Edit Notes")
    public void click_on_label_edit_notes() {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.editNotes();
    }
    @Given("Text Notes as {string}")
    public void text_notes_as(String notes) {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.textNotes(notes);
    }
    @When("User click on Save Notes")
    public void user_click_on_save_notes() {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.saveNotes();
    }
    @Then("Success Save Notes Message as {string} should be displayed")
    public void success_save_notes_message_as_should_be_displayed(String message) throws InterruptedException{
        BoardPage boardPage = new BoardPage(driver);
        Assert.assertEquals(message,boardPage.messageUpdatecardissuccess());
    }

    @When("Attach file")
    public void attach_file() throws InterruptedException{
        BoardPage boardPage = new BoardPage(driver);
        boardPage.attachFile();
    }

    @Then("Success attached Message as {string} should be displayed")
    public void success_attached_message_as_should_be_displayed(String message)throws InterruptedException {
        BoardPage boardPage = new BoardPage(driver);
        Assert.assertEquals(message,boardPage.messageSuccessUpload());
    }
    @Given("Click on change member on card Testing20")
    public void click_on_change_member_on_card_testing20() {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.clickOnLabelChangeMember();
    }

    @When("User Select name muhammad azis")
    public void user_select_name_muhammad_azis() {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.selectMember();
    }

    @Then("Success Toggle Member Message as {string} should be displayed")
    public void success_toggle_member_message_as_should_be_displayed(String message) throws InterruptedException{
        BoardPage boardPage = new BoardPage(driver);
        Assert.assertEquals(message,boardPage.messagetogglemembercardissuccess());
    }
    @When("User Drag Card Test from List test1 to List2 on Card Testing20 on List Testing10")
    public void user_drag_card_test_from_list_test1_to_list2_on_card_testing20_on_list_testing10()throws InterruptedException {
        BoardPage boardPage = new BoardPage(driver);
        boardPage.dragNDrop();
    }

    @Then("Success Moved Message as {string} should be displayed")
    public void success_moved_message_as_should_be_displayed(String string) {
        BoardPage boardPage = new BoardPage(driver);

    }
}
