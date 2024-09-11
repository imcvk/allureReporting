package testClasses;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import base.TestBase;
import pages.RegistrationPage;

public class NewUserCreationTest extends TestBase {
	@Test
	public void validateNewUserCreationFlow() {
		driver.get(
				"https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
		homePage.clickOnHamburgerMenu();
		homePage.clickOnSignInLink();
		loginPage.clickOnNewUserRegistrationBtn();

		registrationPage.selectSalutation("Mr");
		registrationPage.inputFirstname("TestFirstName");
		registrationPage.inputLastname("TestLastName");

		registrationPage.inputEmailId("test@gmail.com");
		registrationPage.inputContactNumber("789456387");
		registrationPage.inputUserName("testUserName");
		registrationPage.inputPassword("testPassword@2024");

		registrationPage.clickOnSubmit();

		AssertJUnit.assertTrue(RegistrationPage.isUserRegisteredSuccessfully());

	}
}
