package billennium;

import lombok.extern.java.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

/**
 * class for base page with exercises
 */
@Log
public class HomePage extends Common {

    By womanCategoryButton = By.xpath("//a[@title='Women']");
    By dressesCategoryButton = By.xpath("//a[@title='Dresses']");
    By shirtsCategoryButton = By.xpath("//a[@title='T-shirts']");
    By signInButton = By.xpath("//div[@class='header_user_info']");
    By homePageSlider = By.id("homepage-slider");
    By productOnHomePage = By.xpath("//h5/a");

    /**
     * constructor
     */
    public HomePage(WebDriver driver) {
        super(driver);
    }

    /**
     * Method check if user is on home page
     */
    public void checkUserIsOnHomePage() {
        log.info("Check if user is on home page");
        waitForWebElement(homePageSlider, Duration.ofSeconds(5));
        log.info("User is on home page");
    }

    /**
     * Method click in sign in button
     */
    public void clickSignInButton() {
        log.info("User click in Sign in button");
        waitForWebElement(signInButton, Duration.ofSeconds(5));
        driver.findElement(signInButton).click();
    }

    /**
     * Method click in woman category button
     */
    public void clickWomanCategoryButton() {
        log.info("User click in Woman category");
        waitForWebElement(womanCategoryButton, Duration.ofSeconds(5));
        driver.findElement(womanCategoryButton).click();
    }

    /**
     * Method click in dresses category button
     */
    public void clickDressesCategoryButton() {
        log.info("User click in Dresses category");
        waitForWebElement(dressesCategoryButton, Duration.ofSeconds(5));
        driver.findElement(dressesCategoryButton).click();
    }

    /**
     * Method click in T-Shirts category button
     */
    public void clickTShirtsCategoryButton() {
        log.info("User click in T-Shirts category");
        waitForWebElement(shirtsCategoryButton, Duration.ofSeconds(5));
        driver.findElement(shirtsCategoryButton).click();
    }

    /**
     * Method click on first product displayed on home page
     */
    public void clickFirstProductDisplayedOnHomePahe() {
        log.info("User click on first product displayed on home page");
        waitForWebElement(productOnHomePage, Duration.ofSeconds(5));
        driver.findElement(productOnHomePage).click();
    }
}
