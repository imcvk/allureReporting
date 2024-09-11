package pages;

import base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductCategoryPage extends TestBase {
    public ProductCategoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "SmokeTests")
    public static WebElement FormalShoes;
    @FindBy(id = "RegressionTests")
    public static WebElement Sports;
    @FindBy(id = "VanguardTests")
    public static WebElement Sneakers;
    @FindBy(xpath = "//button")
    public static List<WebElement> buttonsToNavigate;

    public boolean isUserLoggedIn() {
        boolean f = false;
        try {
            f = FormalShoes.isDisplayed() && Sports.isDisplayed() && Sneakers.isDisplayed();
        } catch (Exception e) {
        }
        return f;
    }
}
