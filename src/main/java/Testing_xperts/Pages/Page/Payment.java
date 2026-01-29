package Testing_xperts.Pages.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Payment {

    WebDriver driver;

    public Payment(WebDriver driver) {
        this.driver = driver;
    }


    //Locators
    private By nameCard = By.xpath("//input[@class='form-control']");

    private By CNumber = By.xpath("//input[@name='card_number' and @type='text']");

    private By cvc = By.xpath("//input[@name='cvc' and @type='text']");

    private By eMonth = By.cssSelector("input[data-qa='expiry-month']");

    private By eyear = By.cssSelector("input[data-qa='expiry-year']");

    private By submit = By.id("submit");

    // Actions

    public void payment(String Cname, String cNumber, String cvv, String Emonth, String Eyear){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

//        wait.until(ExpectedConditions.elementToBeClickable(nameCard))
//                .clear();
        driver.findElement(nameCard).sendKeys(Cname);
//        driver.findElement(nameCard).sendKeys(Cname);
        driver.findElement(CNumber).sendKeys(cNumber);
        driver.findElement(cvc).sendKeys(cvv);
        driver.findElement(eMonth).sendKeys(Emonth);
        driver.findElement(eyear).sendKeys(Eyear);
        driver.findElement(submit).click();
    }




}