package cucumbertest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CartEmpty extends AbstractStepDefs{

    @Given("Click Dress Button")
    public void clickDress(){homePage.clickDressB();}

    @Given("Click Add to cart Button")
    public void clickAC(){homePage.clickAddToCart();}

    @Given("Click On Cross")
    public void clickc(){homePage.clickCross();}

    @Given("Cart Button On Click")
    public void cartbclick(){homePage.cartButtonClick();}

    @When("Click delete")
    public void clickdel(){homePage.clickDelete();}

    @Then("{string} message is show")
    public void cartemptymess(String parameter){
        Assert.assertEquals(homePage.equalscssselector("#center_column > p.alert.alert-warning"),parameter);
    }

}
