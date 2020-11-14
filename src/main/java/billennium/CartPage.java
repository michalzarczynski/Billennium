package billennium;

import lombok.extern.java.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

/**
 * class for base page with exercises
 */
@Log
public class CartPage extends Common {

    /**
     * constructor
     */
    public CartPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Method check if product is in cart
     */
    public void checkProductIsInCart(String productName) {
        log.info("Check if product is in cart");
        waitForWebElement(By.xpath("//a[text()='" + productName + "']"), Duration.ofSeconds(5));
        log.info("Product is in cart");
    }
}
