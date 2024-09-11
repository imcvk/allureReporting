package base;



import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductCategoryPage;
import pages.RegistrationPage;

import java.time.Duration;

public class TestBase {
   public static WebDriver driver;
   public static HomePage homePage;
   public static LoginPage loginPage;
   public static ProductCategoryPage productCategoryPage;
   public static RegistrationPage registrationPage;
   public static WebDriverWait wait;

   public TestBase() {

      }
//@AfterClass
//public void tearDown() {
//   driver.quit();
//   //driver=null;
//}

}
