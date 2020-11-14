package billennium;

import lombok.extern.java.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

/**
 * class for base page with exercises
 */
@Log
public class Common {

    private static final int POLL_INTERVAL_MS = 200;

    protected WebDriver driver;
    protected WebDriverWait wait;

    /**
     * constructor
     */
    public Common(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 15, 200);
    }

    public WebElement waitForWebElement(By by, Duration waitDuration) {
        return new WebDriverWait(driver, waitDuration.getSeconds(), POLL_INTERVAL_MS)
                .until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
