package cucumbertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Optional;

public class homePage {
    private static final String PAGE_URL = "http://automationpractice.com/index.php";

    private static final By CREATE_ACC_ERR = By.xpath("//*[@id=\"center_column\"]/div/ol/li");

    @FindBy(className = "login")
    private WebElement Signinbutton;

    @FindBy(css = "#block_top_menu > ul > li:nth-child(2) > a.sf-with-ul")
    private WebElement Dress_button;

    @FindBy(id = "quantity_wanted")
    private WebElement quantity;

    @FindBy(css = "#add_to_cart > button > span")
    private WebElement addcart;

    @FindBy(id = "total_price")
    private WebElement totalprice;

    @FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span > span")
    private WebElement backbutton;

    @FindBy(css = "#header > div:nth-child(3) > div > div > div:nth-child(3) > div > a")
    private WebElement cartbutton;

    @FindBy(id = "summary_products_quantity")
    private WebElement productqty;

    @FindBy(css = "#searchbox > button.btn")
    private WebElement searchbutton;

    @FindBy(id = "search_query_top")
    private WebElement searchfield;

    @FindBy(id = "SubmitCreate")
    private WebElement acccreatebutton;

    @FindBy(id = "submitAccount")
    private WebElement accsubmitbutton;

    @FindBy(css = "#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-in-line.first-item-of-tablet-line.last-item-of-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default")
    private WebElement addtocart;

    @FindBy(className = "cross")
    private WebElement cross;

    @FindBy(id = "5_19_0_0")
    private WebElement delete;

    @FindBy(id = "id_state")
    private WebElement state;

    @FindBy(css = "#id_state > option:nth-child(11)")
    private WebElement stateopt;




    private WebDriver driver;

    public homePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        this.driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void clickDressB(){this.Dress_button.click();}

    public void clickAddToCart(){this.addtocart.click();}

    public void clickCross(){this.cross.click();}

    public void clickDelete(){this.delete.click();}

    public void onClickCss(String css){getField(By.cssSelector(css)).click();}

    public void quantityClick(){this.quantity.click();}

    public void quantityClear(){this.quantity.clear();}

    public void fillFieldid(String field, String value) {
        getField(By.id(field)).sendKeys(value);
    }

    public void fillFieldCss(String field, String value) {
        getField(By.cssSelector(field)).sendKeys(value);
    }

    public void addtocart(){this.addcart.click();}

    public String priceeq(){return this.totalprice.getText();}

    public WebElement getField(By locator) {
        return driver.findElement(locator);
    }

    public void backButtonClick(){this.backbutton.click();}

    public void cartButtonClick(){this.cartbutton.click();}

    public String productQuantity(){return this.productqty.getText();}

    public void clicksearch(){this.searchbutton.click();}

    public String equalscssselector(String css){return getField(By.cssSelector(css)).getText();}

    public void searchFieldReset(){this.searchfield.clear();}

    public void clickOnSignin(){this.Signinbutton.click();}

    public void clickAccCreateButton(){this.acccreatebutton.click();}

    public void clickAccSubmitButton(){this.accsubmitbutton.click();}

    public void clickstate(){this.state.click();}

    public void selectstate(){this.stateopt.click();}

    public Optional<String> getCreateAccError(){return getErrorMessage(CREATE_ACC_ERR);}

    private Optional<String> getErrorMessage(By errorLocator) {
        Optional<WebElement> error = getError(errorLocator);
        if (error.isPresent()) {
            WebElement errorElement = error.get();
            return Optional.of(errorElement.getText());
        } else {
            return Optional.empty();
        }
    }

    private Optional<WebElement> getError(By errorLocator) {
        List<WebElement> elements = driver.findElements(errorLocator);
        if (elements.size() > 0) {
            return Optional.of(elements.get(0));
        } else {
            return Optional.empty();
        }
    }
}
