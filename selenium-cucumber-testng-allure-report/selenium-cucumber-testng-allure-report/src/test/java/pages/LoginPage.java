package pages;

import base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends TestBase {
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "usr")
    public static WebElement usernameInput;
    @FindBy(id = "pwd")
    public static WebElement password;
    @FindBy(xpath = "//*[@value=\"Login\"]")
    public static WebElement loginBtn;
    @FindBy(id = "NewRegistration")
    public static WebElement newRegistration;

    public void enterUsername(String usernameinputString) {
        usernameInput.sendKeys(usernameinputString);
    }

    public void enterPassword(String pass) {
        password.sendKeys(pass);
    }

    public void clickOnLoginBtn() {
        loginBtn.click();
    }

    public void login(String username, String pass) {
        enterPassword(username);
        enterPassword(pass);
        clickOnLoginBtn();
    }
    public RegistrationPage clickOnNewUserRegistrationBtn(){
        wait.until(ExpectedConditions.visibilityOf(newRegistration));
        newRegistration.click();
        return new RegistrationPage(driver);
    }
}
