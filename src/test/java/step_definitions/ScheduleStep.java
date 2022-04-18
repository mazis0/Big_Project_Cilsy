package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page_model.PaketSoalBPage;
import page_model.SchedulePage;

public class ScheduleStep {
    WebDriver driver;
    public ScheduleStep(){
        super();
        this.driver=Hooks.driver;
    }

    @Given("Click On Schedule")
    public void click_on_schedule() {
        PaketSoalBPage paketSoalBPage = new PaketSoalBPage(driver);
        paketSoalBPage.clickOnSchedule();

    }

    @Given("Click On Create Event")
    public void click_on_create_event() {
        SchedulePage schedulePage = new SchedulePage(driver);
        schedulePage.clickOnLabelCreateEvent();
    }

    @Given("Input title event as {string}")
    public void input_title_event_as(String title) {
        SchedulePage schedulePage = new SchedulePage(driver);
        schedulePage.inputEventTitle(title);
    }

    @Given("Input start date as {string}")
    public void input_start_date_as_with_start_time_as(String startDate) throws InterruptedException{
        SchedulePage schedulePage = new SchedulePage(driver);
        schedulePage.startDateTime(startDate);
    }

    @Given("Input end date as {string}")
    public void input_end_date_as_with_end_time_as(String endDate) throws InterruptedException{
        SchedulePage schedulePage = new SchedulePage(driver);
        schedulePage.endDateTime(endDate);
    }

    @Given("Select Repeat as {string}")
    public void select_repeat_as(String repeat) {
        SchedulePage schedulePage = new SchedulePage(driver);
        if(repeat.equals("Dont Repeat")){
            schedulePage.selectDontRepeat();
        }else if(repeat.equals("Every Day")){
            schedulePage.selectEveryDay();
        }else if(repeat.equals("Every Week")){
            schedulePage.selectEveryWeek();
        }else if(repeat.equals("Every Quarter")){
            schedulePage.selectEveryQuarter();
        }else if(repeat.equals("Every Year")){
            schedulePage.selectEveryYear();
        }else if(repeat.equals("Every Weekday")){
            schedulePage.selectEveryWeekday();
        }else if(repeat.equals("Every Month")){
            schedulePage.selectEveryMonth();
        }else{
            System.out.println("Invalid Input");
        }
    }

    @Given("Select member with as {string}")
    public void select_member_with_as(String member) {
        SchedulePage schedulePage = new SchedulePage(driver);
        if(member.equals(null)){
            System.out.println("No Member Add");
        }else if(member.equals("Muhammad Azis")){
            schedulePage.selectMuhammadAzis();
        }else {
            System.out.println("invalid input");
        }
    }

    @Given("Select private mode as {string}")
    public void select_private_mode_as(String mode) {
        SchedulePage schedulePage = new SchedulePage(driver);
        if(mode.equals("No Private")){
            System.out.println("No Private");
        }else if(mode.equals("Private")){
            schedulePage.slidePrivate();
        }else{
            System.out.println("Invalid Input");
        }
    }

    @Given("Input Notes as {string}")
    public void input_notes_as(String notes)throws InterruptedException {
        SchedulePage schedulePage = new SchedulePage(driver);
        if(notes.equals("Mention Muhammad Azis")){
            schedulePage.inputTextNotesWithMention();
        }else {
            schedulePage.inputTextNotes(notes);
        }
    }

    @When("User click on Post Event")
    public void user_click_on_post_event() throws InterruptedException{
        SchedulePage schedulePage = new SchedulePage(driver);
        schedulePage.clickOnButtonPostEvent();
    }

    @Then("Success post event message as {string} should be displayed")
    public void success_post_event_message_as(String message) throws InterruptedException{
        SchedulePage schedulePage = new SchedulePage(driver);
        if(message.equals("Event title cannot be empty")){
            Assert.assertEquals(message,schedulePage.getErrorMessage());
        }else if(message.equals("Create event successful")){
            Assert.assertEquals(message,schedulePage.getSuccessMessage());
        }else{
            Assert.assertEquals(message,schedulePage.getmessageCreaterecurringoccurrencesuccessful());
        }

    }
    @When("User click on cancel")
    public void user_click_on_cancel() {
        SchedulePage schedulePage = new SchedulePage(driver);
        schedulePage.clickOnCancelButton();
    }
    @Then("User should be on schedule page")
    public void user_should_be_on_schedule_page() {
        SchedulePage schedulePage = new SchedulePage(driver);
        String title = "Schedule";
        Assert.assertEquals(title,schedulePage.getTitle());

    }

    @When("The Ends date is cleared")
    public void the_ends_date_is_cleared() throws InterruptedException{
        SchedulePage schedulePage = new SchedulePage(driver);
        schedulePage.clearEndDateTime();
    }
    @Then("Error Message as {string} must be not displayed")
    public void error_message_as_must_be_not_displayed(String message) {
        SchedulePage schedulePage = new SchedulePage(driver);
        Assert.assertFalse(schedulePage.isErrorMessageCannotchooseenddatetimebeforestartdatetimeDisplayed());
    }

    @Given("Input Ends Time as {string}")
    public void input_ends_time_as(String endsTime)throws InterruptedException {
        SchedulePage schedulePage = new SchedulePage(driver);
        schedulePage.setEndsTime(endsTime);
    }
    @Then("Verify ends Date same with {string}")
    public void verify_ends_date_same_with(String endsDate) {
        SchedulePage schedulePage = new SchedulePage(driver);
        Assert.assertTrue(schedulePage.isEndsDateisChanged(endsDate));
    }

}
