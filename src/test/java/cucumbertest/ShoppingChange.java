package cucumbertest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ShoppingChange extends AbstractStepDefs{

    @Given("Click Cart Button")
    public void cartonclick(){homePage.CartButtonClick();}

    @And("Click On {string} Button")
    public void clickonbutton(String arg0){homePage.OnClickCss(arg0);}

    @And("Click On {string} Field")
    public void clickonfield(String arg0){homePage.OnClickCss(arg0);}

    @And("Fill {string} New Quantity {string}")
    public void newquantity(String arg0, String qty){homePage.FillFieldCss(arg0, qty);}

    @Then("{string} Product Is Show")
    public void ProductQuantityEquals(String arg0){
        Assert.assertEquals(arg0, homePage.ProductQuantity());
    }
}
