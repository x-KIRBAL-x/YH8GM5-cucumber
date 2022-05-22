package cucumbertest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Shopping extends AbstractStepDefs{


    @Given("On click menu {string}")
    public void MenuSelector(String arg0){homePage.OnClickCss(arg0);}

    @And("Click On Subcat {string}")
    public void Subcategory(String arg0){homePage.OnClickCss(arg0);}

    @And("Click On {string}")
    public void ClickOn(String arg0){homePage.OnClickCss(arg0);}

    @And("Filled piece {string}")
    public void filledquantity(String arg0){ homePage.fillFieldid("quantity_wanted", arg0); }

    @And("Click On Quantity")
    public void COQ(){homePage.QuantityClick();}

    @And("Quantity Field Reset")
    public void QuantityR(){homePage.QuantityClear();}

    @And("Add To Cart")
    public void addcartclick(){homePage.addtocart();}

    @And("Back Shopping")
    public void shopback(){homePage.BackButtonClick();}

    @When("Cart Button Click")
    public void cartclick(){homePage.CartButtonClick();}

    @Then("Total Price {string}")
    public void eq(String arg0){
        Assert.assertEquals(arg0, homePage.priceeq());
    }
}
