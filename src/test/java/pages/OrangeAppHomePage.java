package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrangeAppHomePage {
public OrangeAppHomePage(){

    WebDriver driver = Driver.getDriver();
    PageFactory.initElements(driver,this);
}
@FindBy(id = "menu_time_viewTimeModule")
    public WebElement timeBox;
//@FindBy(id = "menu_time_Timesheets")
//    public WebElement timeSheetsButton;

    @FindBy(id="menu_time_Timesheets")
    public WebElement timeSheetButton;

    @FindBy(id="menu_time_viewMyTimesheet")
    public WebElement myTimeSheet;

    @FindBy(id = "menu_admin_viewAdminModule")
    public WebElement adminBtn;

    @FindBy(id = "menu_admin_UserManagement")
    public WebElement userManagementBtn;

    @FindBy(id = "menu_admin_viewSystemUsers")
    public WebElement usersBtn;

    @FindBy(id = "searchSystemUser_userName")
    public WebElement userNameBox;

    @FindBy(id = "searchSystemUser_userType")
    public WebElement UserRoleBox;

//    @FindBy(id = "searchSystemUser_employeeName_empName")
//    public WebElement




}
