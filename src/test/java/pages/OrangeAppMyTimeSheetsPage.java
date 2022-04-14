package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrangeAppMyTimeSheetsPage {
   public OrangeAppMyTimeSheetsPage(){

      WebDriver driver = Driver.getDriver();
      PageFactory.initElements(driver,this);
   }
   @FindBy(id = "startDates")
   public WebElement timeSheetDropdown;

   @FindBy(xpath = "//option[@value='1']")
   public WebElement date1;

   @FindBy(id = "btnEdit")
   public WebElement editButton;

   @FindBy(id = "btnAddRow")
   public WebElement addRowButton;

   @FindBy(id = "initialRows_0_projectName")
   public WebElement projectNameBox;

   @FindBy(id = "initialRows_0_projectActivityName")
   public WebElement activityNameDropdown;

   @FindBy(id = "submitSave")
   public WebElement saveButton;

   @FindBy(id = "btnSubmit")
   public WebElement submitButton;

   @FindBy(id = "timesheet_status")
   public WebElement statusSubmitted;




}
