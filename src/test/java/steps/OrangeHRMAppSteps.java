package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.OrangeAppHomePage;
import pages.OrangeAppLoginPage;
import pages.OrangeAppMyTimeSheetsPage;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;

public class OrangeHRMAppSteps {

        WebDriver driver = Driver.getDriver();
        OrangeAppLoginPage orangeAppLoginPage = new OrangeAppLoginPage();
        OrangeAppHomePage orangeAppHomePage = new OrangeAppHomePage();
        OrangeAppMyTimeSheetsPage orangeAppMyTimeSheetsPage = new OrangeAppMyTimeSheetsPage();


        @Given("user navigates to the HRM app")
        public void user_navigates_to_the_HRM_app(){
            driver.get(ConfigReader.getProperty("OrangeHRAppURL"));
        }
        @When("user provides credentials username {string} and password {string}")
        public void userProvidesCredentialsUsernameAndPassword(String username, String password) {
            orangeAppLoginPage.username.sendKeys(username);
            orangeAppLoginPage.password.sendKeys(password);
            orangeAppLoginPage.loginButton.click();
        }
        @And("user navigates to {string} page")
    public void user_navigates_to_page(String string) throws InterruptedException {

        BrowserUtils.hoverOver(orangeAppHomePage.timeBox);
        Thread.sleep(3000);
        BrowserUtils.hoverOver(orangeAppHomePage.timeSheetButton);
        Thread.sleep(3000);
        orangeAppHomePage.myTimeSheet.click();

    }

    @Then("user chooses and clicks one of the {string} weeks from dropdown")
    public void user_chooses_and_clicks_one_of_the_weeks_from_dropdown(String string) throws InterruptedException {
        BrowserUtils.selectDropdownByValue(orangeAppMyTimeSheetsPage.timeSheetDropdown,"1");
        Thread.sleep(3000);

    }

    @And("user validates the desired {string} week is selected")
    public void user_validates_the_desired_week_is_selected(String string) {

        Assert.assertTrue(orangeAppMyTimeSheetsPage.date1.isSelected());
//        String actual = orangeAppMyTimeSheetsPage.date1.getText();
//        String expected = "2020-04-06 to 2020-04-12";

    }

    @When("user adds a row to the {string} week")
    public void user_adds_a_row_to_the_week(String string) {

        orangeAppMyTimeSheetsPage.editButton.click();
//        orangeAppMyTimeSheetsPage.addRowButton.click();
        orangeAppMyTimeSheetsPage.projectNameBox.click();
        orangeAppMyTimeSheetsPage.projectNameBox.sendKeys("The Coca-Cola Company - Coke - Phase 1");
        orangeAppMyTimeSheetsPage.projectNameBox.sendKeys(Keys.ENTER);
        BrowserUtils.selectDropdownByValue(orangeAppMyTimeSheetsPage.activityNameDropdown,"52");
        orangeAppMyTimeSheetsPage.saveButton.click();
//        orangeAppMyTimeSheetsPage.submitButton.click();

    }


    @And("user validates the row is added")
    public void user_validates_the_row_is_added() {

        Assert.assertTrue(orangeAppMyTimeSheetsPage.statusSubmitted.isDisplayed());

    }


    }




