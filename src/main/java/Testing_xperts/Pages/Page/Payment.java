package Testing_xperts.Pages.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Payment {

    WebDriver driver;
    WebDriverWait wait;

    public Payment(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    private By nameOnCard = By.cssSelector("input[name='name_on_card']");
    private By cardNumber = By.name("card_number");
    private By cvc = By.name("cvc");
    private By expiryMonth = By.cssSelector("input[data-qa='expiry-month']");
    private By expiryYear = By.cssSelector("input[data-qa='expiry-year']");
    private By submitButton = By.id("submit");

    // Actions
    public void makePayment(String name, String number, String cvv, String month, String year) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(nameOnCard)).sendKeys(name);
        driver.findElement(cardNumber).sendKeys(number);
        driver.findElement(cvc).sendKeys(cvv);
        driver.findElement(expiryMonth).sendKeys(month);
        driver.findElement(expiryYear).sendKeys(year);

        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
    }
}