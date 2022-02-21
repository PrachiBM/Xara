package qa.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import qa.pages.HomePage;

public class HomePageSteps {
    HomePage homePage;

    public HomePageSteps() {
        homePage = new HomePage();
    }

    @Given("^User in on Create an account page$")
    public void verifyApplicationHomePage() {
        Assert.assertTrue(homePage.verifyHomePageVisible());
    }
 
    @Given("^Verify that FirstName, LastName, Email and Password is visible$")
    public void verifyInput(){
        Assert.assertTrue(homePage.verifyFirstName());
        Assert.assertTrue(homePage.verifyLastName());
        Assert.assertTrue(homePage.verifyEmail());
        Assert.assertTrue(homePage.verifyPassword());
    }

    @Given("^Verify that Create an account button is disabled$")
    public void createAnAccountButton(){
        Assert.assertTrue(homePage.verifyButtonIsDisabled());
    }
    @When("^User enter invalid details like ([^\"]*) ([^\"]*) ([^\"]*) ([^\"]*) values$")
    public void EnterInvalidDetails(String Firstname, String Lastname, String Mail, String Pass)
    {
    homePage.fillInvalidDetails(Firstname, Lastname, Mail, Pass);
        Assert.assertTrue(homePage.isErrorMessageDisplayed());
    }
    @Then("^Verify that error message is displayed")
    public void ErrorMessage(){
        Assert.assertTrue(homePage.isErrorMessageDisplayed());
    }
}
