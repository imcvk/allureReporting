package step_definitions;

import base.TestBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pages.HomePage;
import pages.LoginPage;
import pages.ProductCategoryPage;
import pages.RegistrationPage;

import java.time.Duration;

public class New_User_creation_Step_Def extends TestBase {
   @Before
   public void setUp() {
      String f = "false";
      try {
         if(((ChromeDriver) driver).getSessionId() == null) {
            f = "true";
         }
      } catch(Exception e) {
      }
      if(f.equals("true") || driver == null) {
         driver = new ChromeDriver();
         wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      }
      driver.manage().window().maximize();
      homePage = new HomePage(driver);
      loginPage = new LoginPage(driver);
      productCategoryPage = new ProductCategoryPage(driver);
      registrationPage = new RegistrationPage(driver);

   }

   @After
   public void tearDown() {
      driver.quit();
      //driver=null;
   }

   @Given("User opens the application and navigate to sign up page")
   public void userOpensTheApplicationAndNavigateToSignUpPage() throws InterruptedException {
      driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
      homePage.clickOnHamburgerMenu();
      homePage.clickOnSignInLink();
      loginPage.clickOnNewUserRegistrationBtn();
   }

   @When("User enters Salutation {string},First Name{string},Last Name{string}")
   public void userEntersSalutationFirstNameLastName(String arg0, String arg1, String arg2) {

      registrationPage.selectSalutation(arg0);
      registrationPage.inputFirstname(arg1);
      registrationPage.inputLastname(arg2);
   }

   @And("User Enters Email id{string},Contact Number{string},UserName{string},Password{string}")
   public void userEntersEmailIdContactNumberUserNamePassword(String arg0, String arg1, String arg2, String arg3) {
      registrationPage.inputEmailId(arg0);
      registrationPage.inputContactNumber(arg1);
      registrationPage.inputUserName(arg2);
      registrationPage.inputPassword(arg3);
   }

   @And("User clicks on submit button")
   public void userClicksOnSubmitButton() {
      registrationPage.clickOnSubmit();
   }

   @Then("New user should be created with given details")
   public void newUserShouldBeCreatedWithGivenDetails() {
      Assert.assertTrue(registrationPage.isUserRegisteredSuccessfully());
   }

}
