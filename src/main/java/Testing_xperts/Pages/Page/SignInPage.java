package Testing_xperts.Pages.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SignInPage {
    WebDriver driver;

    public SignInPage(WebDriver driver){

        this.driver = driver;
    }

    //Locators

    //      SignUp button locator
    private By signupBtn = By.xpath("//a[text()=' Signup / Login']");

    //      Name field
    private By nameBtn = By.xpath("//input[@type='text']");

    //     email field
    private By emailBtn = By.xpath("//input[@type='email' and @data-qa='signup-email']");

    //     signup button
    private By signBtn = By.xpath("//button[text()='Signup' ]");

    //    Title
    private By title = By.xpath("//input[@id='id_gender1']");

    //    Password
    private By password = By.xpath("//input[@id='password']");

    //    DOB/Day
    private By day = By.xpath("//select[@id='days']");

    //        DOB/month
    private By month = By.xpath("//select[@id='months']");

    //        DOB/Year
    private By year = By.xpath("//select[@id='years']");

    //        Newsletter
    private By newsletter = By.xpath("//input[@id='newsletter']");

    //        Option
    private By option = By.xpath("//input[@id='optin']");

    //      FirstName
    private By fname = By.xpath("//input[@id='first_name']");//FirstName

    //        lastname
    private By lname = By.xpath("//input[@id='last_name']");

    //        Comapny
    private By comp = By.xpath("//input[@id='company']");

    //        Address1
    private By add1 = By.xpath("//input[@id='address1']");

    //        Address2
    private By add2 = By.xpath("//input[@id='address2']");

    //      Country
    private By country = By.xpath("//select[@id='country']");

    //        state
    private By state = By.xpath("//input[@id='state']");

    //        city
    private By city = By.xpath("//input[@id='city']");

    //        zipcode
    private By zip = By.xpath("//input[@id='zipcode']");

    //        Mobile Number
    private By m_number = By.xpath("//input[@id='mobile_number']");

    //        Create Button
    private By btn = By.xpath("//button[text()='Create Account']");


    //        Actions
    public void convenientMethod(String name, String email, String pass, String fName, String lName, String company, String Add1, String Add2, String State, String City, String Zip, String mNumber ){
        driver.findElement(signupBtn).click();
        driver.findElement(nameBtn).sendKeys(name);
        driver.findElement(emailBtn).sendKeys(email);
        driver.findElement(signBtn).click();


        driver.findElement(title).click();
        driver.findElement(password).sendKeys(pass);

        Select dobday = new Select(driver.findElement(day));
        dobday.selectByValue("1");

        Select dobMonth = new Select(driver.findElement(month));
        dobMonth.selectByValue("10");

        Select dobYear = new Select(driver.findElement(year));
        dobYear.selectByValue("1999");

        driver.findElement(newsletter).click();
        driver.findElement(option).click();

        driver.findElement(fname).sendKeys(fName);
        driver.findElement(lname).sendKeys(lName);
        driver.findElement(comp).sendKeys(company);
        driver.findElement(add1).sendKeys(Add1);
        driver.findElement(add2).sendKeys(Add2);

        Select sc = new Select(driver.findElement(country));
        sc.selectByValue("India");

        driver.findElement(state).sendKeys(State);
        driver.findElement(city).sendKeys(City);
        driver.findElement(zip).sendKeys(Zip);
        driver.findElement(m_number).sendKeys(mNumber);

        driver.findElement(btn).click();
    }
}