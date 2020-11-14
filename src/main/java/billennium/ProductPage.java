package billennium;

import lombok.extern.java.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

/**
 * class for base page with exercises
 */
@Log
public class ProductPage extends Common {

    By productName = By.xpath("//h1[@itemprop='name']");
    By addToCartButton = By.xpath("//button[@name='Submit']");
    By proceedToCartButton = By.xpath("//a[@title='Proceed to checkout']");

    /**
     * constructor
     */
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Method get product name
     */
    public String getProductName() {
        log.info("Get product name");
        waitForWebElement(productName, Duration.ofSeconds(5));
        WebElement element = driver.findElement(productName);
        String name = element.getText();
        log.info("User got product name");
        return name;
    }

    /**
     * Method click in Add to cart button
     */
    public void clickAddToCartButton() {
        log.info("User click in Add to cart button");
        waitForWebElement(addToCartButton, Duration.ofSeconds(5));
        driver.findElement(addToCartButton).click();
    }

    /**
     * Method click in Proceed to checkout button
     */
    public void clickProceedToCheckoutButton() {
        log.info("User click in Proceed to checkout button");
        waitForWebElement(proceedToCartButton, Duration.ofSeconds(5));
        driver.findElement(proceedToCartButton).click();
    }
}
