package testClasses;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import base.TestBase;


public class LoginTest extends TestBase {
	@Test(enabled = true, description = "Test if user can login", priority = 1)
	public void LoginFlowTest() {
		driver.get(
				"https://anupdamoda.github.io/AceOnlineShoePortal/SignIn.html");
		loginPage.enterUsername("Scott.gale@gmail.com");
		loginPage.enterPassword("P@sword!");
		loginPage.clickOnLoginBtn();
		AssertJUnit.assertTrue(productCategoryPage.isUserLoggedIn());
	}
}
