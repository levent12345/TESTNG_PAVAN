package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HrTest {
    HRpage hr=new HRpage ();
    WebDriver driver;

    @BeforeClass
    void setup(){
        WebDriverManager.chromedriver ().setup ();
        driver=new ChromeDriver ();
        driver.get ("https://opensource-demo.orangehrmlive.com/");
        driver.manage ().timeouts ().implicitlyWait (5, TimeUnit.SECONDS);
    }

    @Test
    void login(){

//      driver.findElement (hr.username).sendKeys ("Admin");
//      driver.findElement (hr.password).sendKeys ("admin123");
//      driver.findElement (hr.login).click ();

        hr.username.sendKeys ("Admin");
        hr.password.sendKeys ("admin123");
        hr.login.click ();

        String title=driver.getTitle ();

        Assert.assertEquals (title,"OrangeHRM");

    }

    @AfterClass
    void tearDown() throws InterruptedException {
        Thread.sleep (2000);
        driver.quit ();
    }
}
