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
import org.testng.annotations.Test;

public class AssertionEx {
    WebDriver driver1;
    WebDriver driver2;
    @BeforeClass
   void setup(){
        WebDriverManager.chromedriver ().setup ();
        WebDriverManager.firefoxdriver ().setup ();
        driver1=new ChromeDriver ();
        driver2=new FirefoxDriver ();
        driver1.get ("https://opensource-demo.orangehrmlive.com/");
        driver2.get ("https://opensource-demo.orangehrmlive.com/");
   }
   @Test
   void logoTest(){
       WebElement logo=driver1.findElement (By.xpath ("//div[@id='divLogo']//img"));
       Assert.assertTrue (logo.isDisplayed ());
       WebElement logo2=driver2.findElement (By.xpath ("//div[@id='divLogo']//img"));
       Assert.assertTrue (logo2.isDisplayed ());

   }
   @Test
   void homePageTitle(){
        String title=driver1.getTitle ();
        Assert.assertEquals (title,"OrangeHRM");
       String title2=driver2.getTitle ();
       Assert.assertEquals (title2,"OrangeHRM");
   }

@AfterClass
    void tearDown() throws InterruptedException {

        Thread.sleep (2000);
        driver1.quit ();
        driver2.quit ();
}

}
