package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1 {
    public WebDriver driver;
    public pom1(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy(css=".menu>li:nth-child(1)>a")
    public WebElement men;

    @FindBy(css= ".menu-open.display>li>article:nth-child(2)>a[href='/gym-t-shirts']")
    public WebElement gym;


    public By pname = By.cssSelector(".products>a[href='/gym-karo-pyaar-nahin-mens-t-shirt']") ;

    //public By pcolor = By.cssSelector("#Burgundy") ;
    @FindBy(xpath= "//label[@for='Burgundy']//span")
    public WebElement pcolor;

    //label[@for='Burgundy']//span

    @FindBy(css=".size-box>.size:nth-child(2)")
    public WebElement size;

    @FindBy(css=".quantity-box>select")
    public WebElement qty;

    @FindBy(css=".product-add-button>.left>a")
    public WebElement addcart;

    @FindBy(css=".add-cart-icon")
    public WebElement addcartbutton;
    @FindBy(css=".productdetail>.cartpname")
    public WebElement vpname;

    @FindBy(css=".product-remove>.right>a")
    public WebElement movewishlist;












}
