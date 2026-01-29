package Testing_xperts.Pages.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteUser {
    WebDriver driver;
    public DeleteUser(WebDriver driver){
        this.driver=driver;
    }
    //Locators
    private By deleteuser = By.xpath("//a[text()=' Delete Account']");


    //Actions
    public void delUser(){
        driver.findElement(deleteuser).click();
    }
}
