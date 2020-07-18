package Assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class AssertionsEx {

    WebDriver driver;
    @BeforeClass
    void setup(){
        WebDriverManager.chromedriver ().setup ();
        driver=new ChromeDriver ();
        driver.get ("https://opensource-demo.orangehrmlive.com/");

    }
    @Test(priority = 1)
    void logoTest(){

        WebElement logo=driver.findElement (By.id ("divLogo"));

        Assert.assertTrue (logo.isDisplayed (),"Logo not Displayed on the page");
       // driver.navigate ().refresh ();
       // Assert.assertTrue (logo.isDisplayed ());



    }

    @Test(priority = 2)
    void homePageTitle(){

        String title=driver.getTitle ();
        Assert.assertEquals ("OrangeHRM",title,"Title is not Mach");
    }


    @AfterClass
    void tearDown(){

        driver.quit ();
    }
}
