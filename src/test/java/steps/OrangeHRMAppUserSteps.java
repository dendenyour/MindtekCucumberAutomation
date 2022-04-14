package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.OrangeAppHomePage;
import pages.OrangeAppLoginPage;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;
import java.util.Map;

public class OrangeHRMAppUserSteps {

    WebDriver driver = Driver.getDriver();
    OrangeAppLoginPage orangeAppLoginPage = new OrangeAppLoginPage();
    OrangeAppHomePage orangeAppHomePage = new OrangeAppHomePage();
    List<Map<String, Object>> data;


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

    @And("user moves to users page")
    public void user_moves_to_users_page() {

        BrowserUtils.hoverOver(orangeAppHomePage.adminBtn);
        BrowserUtils.hoverOver(orangeAppHomePage.userManagementBtn);
        BrowserUtils.hoverOver(orangeAppHomePage.usersBtn);
    }

    @Then("user searches for valid user with data")
    public void user_searches_for_valid_user_with_data(DataTable validData) {

        data = validData.asMaps(String.class,Object.class);



    }

    @Then("user validates user is shown")
    public void user_validates_user_is_shown() {


    }


    @Then("user searches for invalid user with data")
    public void user_searches_for_invalid_user_with_data() {


    }

    @Then("user validates error message {string} is shown")
    public void user_validates_error_message_is_shown(String string) {


    }



}
