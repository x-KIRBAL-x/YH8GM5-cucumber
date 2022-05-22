package cucumbertest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Searching extends AbstractStepDefs{

    @Given("Fill Search With {string}")
    public void fillWithText(String parameter) {
        homePage.fillFieldid("search_query_top", parameter);
    }

    @When("Click On Search Button")
    public void search(){ homePage.clicksearch();}

    @Then("Result Show {string}")
    public void resultequals(String parameter){
        Assert.assertEquals(homePage.Equalscssselector("#center_column > h1 > span.heading-counter"),parameter);
    }
    @And("Search Reset")
    public void searchreset(){homePage.SearchFieldReset();}
}
