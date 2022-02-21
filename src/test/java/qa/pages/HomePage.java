package qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage() {

        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(this.driver, 35);
    }

    @FindBy(how = How.XPATH, using ="//*[contains(text(),'Create an account')]")
    private WebElement CreateAcc;

    public boolean verifyHomePageVisible() {
        return isElementVisible(CreateAcc);
    }

    @FindBy(how = How.XPATH, using = "//*[contains(@name,'firstname')]")
    private WebElement FirstName;

    @FindBy(how = How.XPATH, using = "//*[contains(@name,'lastname')]")
    private WebElement LastName;

    @FindBy(how = How.XPATH, using = "//*[contains(@name,'email')]")
    private WebElement Email;

    @FindBy(how = How.XPATH, using = "//*[contains(@name,'password')]")
    private WebElement Password;

    public boolean verifyFirstName() {
        return isElementVisible(FirstName);
    }
    public boolean verifyLastName() {
        return isElementVisible(LastName);
    }
    public boolean verifyEmail() {
        return isElementVisible(Email);
    }
    public boolean verifyPassword() {
        return isElementVisible(Password);
    }

    @FindBy(how = How.XPATH, using = "//span[text()=\"Create an account\"]")
    private WebElement CreateAccount;

    public boolean verifyButtonIsDisabled() {
        return isElementClickable(CreateAccount);
    }
    @FindBy(how = How.XPATH, using = "//*[text()=\"Invalid email format, please try again.\"]")
    private WebElement ErrorMessage;

    public void fillInvalidDetails(String FirstName, String LastName, String Email, String Password) {
        enterKeys(this.FirstName, FirstName);
        enterKeys(this.LastName, LastName);
        enterKeys(this.Email, Email);
        enterKeys(this.Password, Password);
        clickElement(CreateAccount);
    }

    public boolean isErrorMessageDisplayed() {
        return isElementVisible(ErrorMessage);
    }

}
