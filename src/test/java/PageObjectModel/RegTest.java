package PageObjectModel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegTest {
    WebDriver driver;
  @BeforeClass
  void setDriver(){
      WebDriverManager.chromedriver ().setup ();
      driver=new ChromeDriver ();
     // driver.manage ().window ().maximize ();
      driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
  }
  @Test
    void verifyFlightPage(){

      RegPage rp=new RegPage (driver);
      driver.get ("http://demo.guru99.com/test/newtours/");
      rp.clickRegLink ();
      rp.setFirstName ("Haciali");
      rp.setLastName ("Veli");
      rp.setPhone ("4252334245");
      rp.setEmail ("veli@gmail.com");
      rp.setAdress (" 123 Honeysuckle lane");
      rp.setCity ("schaumburg");
      rp.setState ("IL");
      rp.setPostalCode ("60173");
      rp.setCountry ("UNITED STATES");
      rp.setUsername ("aliveli");
      rp.setPassword ("veli123");
      rp.setComfirmPassword ("veli123");
      rp.clickSubmit ();













  }
  @AfterClass
    void tearDown() throws InterruptedException {
      Thread.sleep (3000);
      driver.quit ();
  }



}
