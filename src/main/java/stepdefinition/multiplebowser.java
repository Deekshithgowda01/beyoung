package stepdefinition;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class multiplebowser {

    public WebDriver driver;
    public WebDriver multibowserlaunch(String browser)
    {
        if(browser.equals("chrome"))
        {
            ChromeOptions opt=new ChromeOptions();
            opt.addArguments("--remote-allow-origin=*");
            WebDriverManager.chromedriver().setup();
             driver=new ChromeDriver(opt);
             driver.manage().window().maximize();
            return driver;
        }
        else if(browser.equals("edge"))
        {
            WebDriverManager.edgedriver().setup();
             driver=new EdgeDriver();
            return driver;
        }
        else{
            System.out.println("no browser");
    }
        return null;
    }

    public Actions actionclass()
    {
        Actions a=new Actions(driver);
        return a;
    }

    public WebDriverWait explicitwait()
    {
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofMinutes(1));
        return wait;


    }
}
