package cucumbertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage{
    private static final String PAGE_URL = "http://automationpractice.com/index.php";

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

    //#summary_products_quantity
    @FindBy(id = "summary_products_quantity")
    private WebElement productqty;

    @FindBy(css = "#searchbox > button.btn")
    private WebElement searchbutton;

    @FindBy(id = "search_query_top")
    private WebElement searchfield;


    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        this.driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void ClickDressB(){this.Dress_button.click();}

    public void OnClickCss(String css){getField(By.cssSelector(css)).click();}

    public void QuantityClick(){this.quantity.click();}

    public void QuantityClear(){this.quantity.clear();}

    public void fillFieldid(String field, String value) {
        getField(By.id(field)).sendKeys(value);
    }

    public void FillFieldCss(String field, String value) {
        getField(By.cssSelector(field)).sendKeys(value);
    }

    public void addtocart(){this.addcart.click();}

    public String priceeq(){return this.totalprice.getText();}

    public String productquantity(String css){return getField(By.cssSelector(css)).getText();}

    public WebElement getField(By locator) {
        return driver.findElement(locator);
    }

    public void BackButtonClick(){this.backbutton.click();}

    public void CartButtonClick(){this.cartbutton.click();}

    public String ProductQuantity(){return this.productqty.getText();}

    public void clicksearch(){this.searchbutton.click();}

    public String Equalscssselector(String css){return getField(By.cssSelector(css)).getText();}

    public void SearchFieldReset(){this.searchfield.clear();}
}
