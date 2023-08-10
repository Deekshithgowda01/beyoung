package stepdefinition;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.util.Asserts;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import pom.pom1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class step extends multiplebowser{
    public pom1 po;
    public WebDriver driver;

    public JavascriptExecutor js;
    @Given("open the bowser and enter the url {string}")
    public void open_the_bowser_and_enter_the_url(String url) throws IOException {
        FileInputStream file =new FileInputStream("C:\\Users\\deekshith.gowda\\Favorites\\intelijpractice\\beyoung\\src\\main\\config.properties");
        Properties prop=new Properties();
        prop.load(file);
         driver = multibowserlaunch(prop.getProperty("browser"));
         driver.get(url);
          po =new pom1(driver);

    }


    @When("mousehover on men and click on gym theme")
    public void mousehover_on_men_and_click_on_gym_theme() {
        explicitwait().until(ExpectedConditions.visibilityOf(po.men));
        actionclass().moveToElement(po.men).build().perform();
        actionclass().moveToElement(po.gym).click().build().perform();


    }



    @Then("validate proper theme is dislayed")
    public void validate_proper_theme_is_dislayed() {
        String exptitle = driver.getTitle();
        String acttitle="Buy Gym T Shirts For Men Online Upto 50% Off at Beyoung";
        if(exptitle.equalsIgnoreCase(acttitle))
        {
            System.out.println("tc pass");
        }
        else
        {
            System.out.println("tc fail");
        }
    }



    @When("select gym tshirt based on user interest")
    public void select_gym_tshirt_based_on_user_interest() {
         js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)","");
        explicitwait().until(ExpectedConditions.visibilityOfElementLocated(po.pname)).click();


    }



    @When("select color,size,qty")
    public void select_color_size_qty() {
      explicitwait().until(ExpectedConditions.visibilityOf(po.pcolor)).click();
      po.size.click();
        Select sel=new Select(po.qty);
        sel.selectByVisibleText("3");

    }



    @When("add to cart")
    public void add_to_cart() {
        js.executeScript("window.scrollBy(0,200)","");
        po.addcart.click();
    }



    @Then("validate proper item displayed in cart")
    public void validate_proper_item_displayed_in_cart() {
       po.addcartbutton.click();
       explicitwait().until(ExpectedConditions.visibilityOf(po.vpname));
        String vproductname = po.vpname.getText();
        if(vproductname.equalsIgnoreCase("Gym Karo Pyaar Nahi Half Sleeve T-shirt for Men"))
        {
            System.out.println("tc pass");
        }
        else
        {
            System.out.println("tc faill");
        }
        po.movewishlist.click();
        driver.close();
    }

}
