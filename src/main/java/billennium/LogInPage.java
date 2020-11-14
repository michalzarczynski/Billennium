package billennium;

import lombok.extern.java.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

/**
 * class for base page with exercises
 */
@Log
public class LogInPage extends Common {

    By createAccountText = By.xpath("//h3[text()='Create an account']");
    By createAccountButton = By.id("SubmitCreate");
    By emailCreateInputField = By.id("email_create");

    /**
     * constructor
     */
    public LogInPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Method check if user is on Sign in page
     */
    public void checkUserIsOnSignInPage() {
        log.info("Check if user is on Sign in page");
        waitForWebElement(createAccountText, Duration.ofSeconds(5));
        log.info("User is on Sign in page");
    }

    /**
     * Method click in create account button
     */
    public void clickCreateAccountButton() {
        log.info("User click in create account button");
        waitForWebElement(createAccountButton, Duration.ofSeconds(5));
        driver.findElement(createAccountButton).click();
    }

    /**
     * Method enter email for new account
     */
    public void sendEmailForNewAccount(String email) {
        log.info("User send email: " + email + " for new account");
        waitForWebElement(emailCreateInputField, Duration.ofSeconds(5));
        driver.findElement(emailCreateInputField).sendKeys(email);
    }
}
