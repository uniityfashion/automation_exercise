package Testing_xperts.Pages.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {

    WebDriver driver;

    public Checkout(WebDriver driver){
        this.driver=driver;
    }
    //Locators

    private By cartBtn = By.xpath("//a[normalize-space()='Cart']");

    private By addToCart = By.xpath("//a[normalize-space()='Proceed To Checkout']");

    private By placeOrder = By.xpath("//a[@class='btn btn-default check_out']");


    // Actions

    public void checkout(){
        driver.findElement(cartBtn).click();
        driver.findElement(addToCart).click();
        driver.findElement(placeOrder).click();
    }
}