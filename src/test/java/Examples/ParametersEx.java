package Examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersEx {
    WebDriver driver;

    @BeforeClass @Parameters({"browser","url"})
   void setup(String browser,String url){
        if(browser.equalsIgnoreCase ("chrome")){
            WebDriverManager.chromedriver ().setup ();
            driver=new ChromeDriver ();

        }
        else if(browser.equalsIgnoreCase ("firefox")){
            WebDriverManager.firefoxdriver ().setup ();
            driver=new FirefoxDriver ();

        }

        driver.get (url);

   }
   @Test
   void logoTest(){
       WebElement logo=driver.findElement (By.xpath ("//div[@id='divLogo']//img"));
       Assert.assertTrue (logo.isDisplayed ());


   }
   @Test
   void homePageTitle(){
        String title=driver.getTitle ();
        Assert.assertEquals (title,"OrangeHRM");

   }

@AfterClass
    void tearDown() throws InterruptedException {

        Thread.sleep (2000);
        driver.quit ();

}

}
