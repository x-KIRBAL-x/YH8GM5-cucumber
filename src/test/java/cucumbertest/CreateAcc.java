package cucumbertest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Optional;

import static org.junit.Assert.fail;

public class CreateAcc extends AbstractStepDefs{

    @And("Click Sign in button")
    public void clickSignIn(){homePage.clickOnSignin();}

    @And("Fill Email Address field with {string}")
    public void fillEmail(String arg0){homePage.fillFieldid("email_create",arg0);}

    @And("Click Create Acc Button")
    public void clickAccCreate(){homePage.clickAccCreateButton();}

    @Given("Fill First Name field with {string}")
    public void fillFirstName(String arg0){homePage.fillFieldid("customer_firstname",arg0);}

    @And("Fill Last Name field with {string}")
    public void fillLastName(String arg0){homePage.fillFieldid("customer_lastname",arg0);}

    @And("Fill Password field with {string}")
    public void fillPass(String arg0){homePage.fillFieldid("passwd",arg0);}

    @And("Fill Address field with {string}")
    public void fillAdress(String arg0){homePage.fillFieldid("address1",arg0);}

    @And("Fill City field with {string}")
    public void fillCity(String arg0){homePage.fillFieldid("city",arg0);}

    @And("Fill Postcode field with {string}")
    public void fillPostCode(String arg0){homePage.fillFieldid("postcode",arg0);}

    @And("Fill Phone field with {string}")
    public void fillPhone(String arg0){homePage.fillFieldid("phone_mobile",arg0);}

    @When("Click Acc Submit Button")
    public void clickAccSubmit(){homePage.clickAccSubmitButton();}

    @Given("click state")
    public void clickonstate(){homePage.clickstate();}

    @Given("select state")
    public void selectstateopt(){homePage.selectstate();}

    @Then("the {string} error message is shown")
    public void theMsgErrorMessageIsShown(String msg) {
        Optional<String> errorMessage = homePage.getCreateAccError();
        if (errorMessage.isPresent()) {
            Assert.assertEquals(msg, errorMessage.get());
        } else {
            fail();
        }
    }


}
