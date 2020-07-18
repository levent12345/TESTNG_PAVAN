package seleniumEX;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WaitEx {
    WebDriver driver;
    @Test
   void setup(){
        WebDriverManager.chromedriver ().setup ();
        driver=new ChromeDriver ();
        driver.get ("https://opensource-demo.orangehrmlive.com/");
        driver.manage ().timeouts ().implicitlyWait (5, TimeUnit.SECONDS);

        WebDriverWait wait=new WebDriverWait (driver,5);


   }


}
