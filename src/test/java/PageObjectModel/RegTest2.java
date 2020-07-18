package PageObjectModel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegTest2 {
    WebDriver driver;
  @BeforeClass
  void setDriver(){
      WebDriverManager.chromedriver ().setup ();
      driver=new ChromeDriver ();
     // driver.manage ().window ().maximize ();
      driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
  }
  @Test
    void verifyFlightPage() throws InterruptedException {

      RegPage2 rp=new RegPage2 (driver);
      driver.get ("http://demo.guru99.com/test/newtours/");
      Thread.sleep (6000);
      rp.tv.click ();
     rp.reglink.click ();
     rp.firstname.sendKeys ("Ali");
     rp.lastname.sendKeys ("veli");
     rp.phone.sendKeys ("4251235689");
     rp.email.sendKeys ("xdf@gmail.com");
     rp.adress.sendKeys ("123 honeysuckle lane");
     rp.city.sendKeys ("Chicago");













  }
  @AfterClass
    void tearDown() throws InterruptedException {
      Thread.sleep (3000);
      driver.quit ();
  }



}
