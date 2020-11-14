package billennium;

import lombok.extern.java.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

/**
 * class for base page with exercises
 */
@Log
public class CreateAccountPage extends Common {

    private static final String FOR_NEW_ACCOUNT = " for new account";
    By firstNameInputField = By.id("customer_firstname");
    By lastNameInputField = By.id("customer_lastname");
    By passwordInputField = By.id("passwd");
    By addressInputField = By.id("address1");
    By cityInputField = By.id("city");
    By zipCodeInputField = By.id("postcode");
    By phoneMobileInputField = By.id("phone_mobile");
    By stateDropdown = By.id("id_state");
    By firstPositionFromStateDropdown = By.xpath("//select[@id='id_state']/option[@value='1']");
    By registerButton = By.id("submitAccount");

    /**
     * constructor
     */
    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Method enter first name for new account
     */
    public void sendFirstNameForNewAccount(String firstName) {
        log.info("User send first name: " + firstName + FOR_NEW_ACCOUNT);
        waitForWebElement(firstNameInputField, Duration.ofSeconds(5));
        driver.findElement(firstNameInputField).sendKeys(firstName);
    }

    /**
     * Method enter last name for new account
     */
    public void sendLastNameForNewAccount(String lastName) {
        log.info("User send last name: " + lastName + FOR_NEW_ACCOUNT);
        waitForWebElement(lastNameInputField, Duration.ofSeconds(5));
        driver.findElement(lastNameInputField).sendKeys(lastName);
    }

    /**
     * Method enter password for new account
     */
    public void sendPasswordForNewAccount(String password) {
        log.info("User send password: " + password + FOR_NEW_ACCOUNT);
        waitForWebElement(passwordInputField, Duration.ofSeconds(5));
        driver.findElement(passwordInputField).sendKeys(password);
    }

    /**
     * Method enter address for new account
     */
    public void sendAddressForNewAccount(String address) {
        log.info("User send address: " + address + FOR_NEW_ACCOUNT);
        waitForWebElement(addressInputField, Duration.ofSeconds(5));
        driver.findElement(addressInputField).sendKeys(address);
    }

    /**
     * Method enter city for new account
     */
    public void sendCityForNewAccount(String city) {
        log.info("User send city: " + city + FOR_NEW_ACCOUNT);
        waitForWebElement(cityInputField, Duration.ofSeconds(5));
        driver.findElement(cityInputField).sendKeys(city);
    }

    /**
     * Method enter zip code for new account
     */
    public void sendZipCodeForNewAccount(String zipCode) {
        log.info("User send zip code: " + zipCode + FOR_NEW_ACCOUNT);
        waitForWebElement(zipCodeInputField, Duration.ofSeconds(5));
        driver.findElement(zipCodeInputField).sendKeys(zipCode);
    }

    /**
     * Method enter mobile phone number for new account
     */
    public void sendMobilePhoneNumberForNewAccount(String mobilePhoneNumber) {
        log.info("User send mobile phone number: " + mobilePhoneNumber + FOR_NEW_ACCOUNT);
        waitForWebElement(phoneMobileInputField, Duration.ofSeconds(5));
        driver.findElement(phoneMobileInputField).sendKeys(mobilePhoneNumber);
    }

    /**
     * Method select first state from dropdown list for new account
     */
    public void selectFirstStateFromDropdownListForNewAccount() {
        log.info("User select first state from dropdown list for new account");
        waitForWebElement(registerButton, Duration.ofSeconds(5));
        driver.findElement(stateDropdown).click();
        driver.findElement(firstPositionFromStateDropdown).click();
    }

    /**
     * Method click in create account button
     */
    public void clickRegisterButton() {
        log.info("User click in register button");
        waitForWebElement(registerButton, Duration.ofSeconds(5));
        driver.findElement(registerButton).click();
    }
}
