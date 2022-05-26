package cucumbertest;


import io.cucumber.java.en.Given;

public class CommonStepDefs extends AbstractStepDefs{

    @Given("Open Home Page")
    public void theHomePageIsOpened() {
        homePage.openPage();
    }
}
