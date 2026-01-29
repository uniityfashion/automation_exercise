package Testing_xperts.Pages.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Homepage {

    WebDriver driver;

    public Homepage(WebDriver driver){
        this.driver=driver;
    }

    //Locators
    private By item = By.xpath("//a[@href='/product_details/5']");

    private By addToCartBtn = By.xpath("//button[@class='btn btn-default cart']");

    private By cBtn = By.xpath("//button[text()='Continue Shopping']");

    //Actions
    public void homePage() {
        driver.findElement(item).click();
        driver.findElement(addToCartBtn).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement continueBtn = wait.until(
                ExpectedConditions.elementToBeClickable(cBtn));
        continueBtn.click();

    }
}
