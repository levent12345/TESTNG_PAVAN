package Examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParalelT {
    WebDriver driver;

    @Test
    void logoTest(){
        WebDriverManager.chromedriver ().setup ();
        driver=new ChromeDriver ();
        driver.get ("https://opensource-demo.orangehrmlive.com/");
        WebElement logo=driver.findElement (By.xpath ("//div[@id='divLogo']//img"));
        Assert.assertTrue (logo.isDisplayed ());
    }
    @Test
    void homepageTitle(){
        WebDriverManager.chromedriver ().setup ();
        driver=new ChromeDriver ();
        driver.get ("https://opensource-demo.orangehrmlive.com/");
        String title=driver.getTitle ();
        Assert.assertEquals (title,"OrangeHRM");
    }

//    @AfterMethod
//    void tearDown() throws InterruptedException {
//
//        Thread.sleep (2000);
//        driver.quit ();
//    }
}
