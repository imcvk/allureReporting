package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.HomePage;
import pages.LoginPage;
import pages.ProductCategoryPage;
import pages.RegistrationPage;

public class TestBase {
	public static WebDriver driver;
	public static HomePage homePage;
	public static LoginPage loginPage;
	public static ProductCategoryPage productCategoryPage;
	public static RegistrationPage registrationPage;
	public static WebDriverWait wait;

	public TestBase() {

	}
	@BeforeTest
	public void setUp() {
		if (driver == null) {
			driver = new ChromeDriver();

		}
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		productCategoryPage = new ProductCategoryPage(driver);
		registrationPage = new RegistrationPage(driver);

	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
