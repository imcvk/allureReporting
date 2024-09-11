package step_definitions;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
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

public class LoginStepDef extends TestBase {

   @Before
   public void setUp() {
      String f = "false";
      try{
      if(((ChromeDriver) driver).getSessionId() == null) {
         f = "true";
      }}catch(Exception e){}
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

   @Given("User navigates to the Login page")
   public void user_navigates_to_the_login_page() {
      driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/SignIn.html");
   }

   @When("User successfully enters the log in details")
   public void user_successfully_enters_the_log_in_details() {
      loginPage.enterUsername("Scott.gale@gmail.com");
      loginPage.enterPassword("P@sword!");
      loginPage.clickOnLoginBtn();
   }

   @Then("User should be able to view the product category page")
   public void user_should_be_able_to_view_the_product_category_page() {
      Assert.assertTrue(productCategoryPage.isUserLoggedIn());
   }

}
