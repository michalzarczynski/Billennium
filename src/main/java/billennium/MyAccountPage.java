package billennium;

import lombok.extern.java.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

/**
 * class for base page with exercises
 */
@Log
public class MyAccountPage extends Common {

    By myAccountHeader = By.xpath("//h1[text()='My account']");

    /**
     * constructor
     */
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Method check if user is on My Account page
     */
    public void checkUserIsOnMyAccountPage() {
        log.info("Check if user is on My Account page");
        waitForWebElement(myAccountHeader, Duration.ofSeconds(5));
        log.info("User is on My Account  page");
    }
}
