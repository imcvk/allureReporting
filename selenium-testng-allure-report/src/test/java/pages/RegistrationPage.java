package pages;

import base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends TestBase {
   public RegistrationPage(WebDriver driver) {
      PageFactory.initElements(driver, this);
   }

   @FindBy(id = "Salutation")
   public static WebElement salutationsList;
   @FindBy(id = "firstname")
   public static WebElement firstname;
   @FindBy(id = "lastname")
   public static WebElement lastname;
   @FindBy(id = "emailId")
   public static WebElement emailIdemailId;
   @FindBy(id = "contactNumber")
   public static WebElement contactNumber;
   @FindBy(xpath = "//*[text()='UserName:']/following-sibling::input[1]")
   public static WebElement UserName;
   @FindBy(xpath = "//*[text()='Password:']/following-sibling::input[1]")
   public static WebElement Password;
   @FindBy(xpath = "//*[@type='submit']")
   public static WebElement submit;
   @FindBy(xpath = "//h1[text()='User Registered Successfully !!!']")
   public static WebElement UserRegisteredSuccessfullyMsg;

   public void selectSalutation(String sal) {
      Select s = new Select(salutationsList);
      s.selectByValue(sal);
   }

   public void inputFirstname(String fName) {
      firstname.sendKeys(fName);
   }

   public void inputLastname(String lName) {
      lastname.sendKeys(lName);
   }

   public void inputEmailId(String emailId) {
      emailIdemailId.sendKeys(emailId);
   }

   public void inputContactNumber(String cNumber) {
      contactNumber.sendKeys(cNumber);
   }

   public void inputUserName(String uName) {
      UserName.sendKeys(uName);
   }

   public void inputPassword(String password) {
      Password.sendKeys(password);
   }

   public  void clickOnSubmit() {
      submit.click();
   }

   public void resisterUser(String sal, String First_Name, String Last_Name, String Email_id, String Contact_Number, String UserName, String Password) {
      selectSalutation(sal);
      inputFirstname(First_Name);
      inputLastname(Last_Name);
      inputEmailId(Email_id);
      inputContactNumber(Contact_Number);
      inputUserName(UserName);
      inputPassword(Password);
      clickOnSubmit();
   }

   public static boolean isUserRegisteredSuccessfully() {
      boolean f = false;
      try {
         f = UserRegisteredSuccessfullyMsg.isDisplayed();
      } catch(Exception e) {
      }
      return f;
   }
}
