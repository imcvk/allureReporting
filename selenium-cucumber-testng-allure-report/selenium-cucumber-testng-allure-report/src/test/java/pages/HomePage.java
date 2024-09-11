package pages;

import base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
   public HomePage(WebDriver driver) {
      PageFactory.initElements(driver, this);
   }

   @FindBy(xpath = "//*[@type='checkbox']")
   public static WebElement HamburgerMenu;
   @FindBy(xpath = "//a//*[text()='Sign In Portal']")
   public static WebElement signInLink;
   @FindBy(xpath = "//a//*[text()='Online Products']")
   public static WebElement OnlineProducts;

   public void clickOnHamburgerMenu() {
      HamburgerMenu.click();
   }

   public void clickOnSignInLink() throws InterruptedException {
    Thread.sleep(1000);
      signInLink.click();
   }

   public void clickOnOnlineProducts() {
      OnlineProducts.click();
   }
}
