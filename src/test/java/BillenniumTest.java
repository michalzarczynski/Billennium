import billennium.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Class contains exercises test
 */
public class BillenniumTest {

    WebDriver driver;
    HomePage homePage;
    LogInPage logInPage;
    CreateAccountPage createAccountPage;
    MyAccountPage myAccountPage;
    ProductPage productPage;
    CartPage cartPage;

    /**
     * Open test page in Google Chrome and maximize window
     */
    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        logInPage = new LogInPage(driver);
        createAccountPage = new CreateAccountPage(driver);
        myAccountPage = new MyAccountPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
    }

    /**
     * close browser after each test
     */
    @AfterEach
    public void closeBrowser() {
        driver.quit();
    }

    /**
     * Test open http://automationpractice.com/ home page and check if user can add product to cart
     */
    @Test
    public void checkUserCanAddProductToCart() {
        homePage.checkUserIsOnHomePage();
        homePage.clickFirstProductDisplayedOnHomePahe();
        String productName = productPage.getProductName();
        productPage.clickAddToCartButton();
        productPage.clickProceedToCheckoutButton();
        cartPage.checkProductIsInCart(productName);
    }

    /**
     * Test check if user can create new account
     */
    @Test
    public void checkUserCanCreateNewAccount() {
        Random rand = new Random();
        int int_random = rand.nextInt(1000);
        String newAccountName = "test" + int_random + int_random;
        homePage.checkUserIsOnHomePage();
        homePage.clickSignInButton();
        logInPage.checkUserIsOnSignInPage();
        logInPage.sendEmailForNewAccount(newAccountName + "@test3.fg");
        logInPage.clickCreateAccountButton();
        createAccountPage.sendFirstNameForNewAccount("testFirstName");
        createAccountPage.sendLastNameForNewAccount("testLastName");
        createAccountPage.sendPasswordForNewAccount("testPassword");
        createAccountPage.sendAddressForNewAccount("testAddress");
        createAccountPage.sendCityForNewAccount("testCity");
        createAccountPage.sendZipCodeForNewAccount("12345");
        createAccountPage.sendMobilePhoneNumberForNewAccount("123456789");
        createAccountPage.selectFirstStateFromDropdownListForNewAccount();
        createAccountPage.clickRegisterButton();
        myAccountPage.checkUserIsOnMyAccountPage();
    }
}
