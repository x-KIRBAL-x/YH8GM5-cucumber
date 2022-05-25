package cucumbertest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Shopping extends AbstractStepDefs{


    @Given("On click menu {string}")
    public void menuSelector(String arg0){homePage.onClickCss(arg0);}

    @And("Click On Subcat {string}")
    public void subcategory(String arg0){homePage.onClickCss(arg0);}

    @And("Click On {string}")
    public void clickOn(String arg0){homePage.onClickCss(arg0);}

    @And("Filled piece {string}")
    public void filledquantity(String arg0){ homePage.fillFieldid("quantity_wanted", arg0); }

    @And("Click On Quantity")
    public void coq(){homePage.quantityClick();}

    @And("Quantity Field Reset")
    public void quantityR(){homePage.quantityClear();}

    @And("Add To Cart")
    public void addcartclick(){homePage.addtocart();}

    @And("Back Shopping")
    public void shopback(){homePage.backButtonClick();}

    @When("Cart Button Click")
    public void cartclick(){homePage.cartButtonClick();}

    @Then("Total Price {string}")
    public void eq(String arg0){
        Assert.assertEquals(arg0, homePage.priceeq());
    }
}
