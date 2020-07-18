package scroll;

import PageObjectModel.RegPage2;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class scroll1 {
    WebDriver driver;
  @BeforeClass
  void setDriver(){
      WebDriverManager.chromedriver ().setup ();
      driver=new ChromeDriver ();
      driver.manage ().window ().maximize ();
      driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
  }
  @Test
    void verifyFlightPage() throws InterruptedException {

      driver.get ("https://www.countries-ofthe-world.com/all-countries.html");

      JavascriptExecutor js=(JavascriptExecutor) driver;
      Thread.sleep (2000);
      //js.executeScript ("window.scrollBy(0,1000)","");

      WebElement tr=driver.findElement (By.xpath ("//li[contains(text(),'Turkey')]"));
      js.executeScript ("arguments[0].scrollIntoView();",tr);







  }
  @AfterClass
    void tearDown() throws InterruptedException {
      Thread.sleep (3000);
      driver.quit ();
  }



}
