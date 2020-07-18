package seleniumEX;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class windowhandle {
    WebDriver driver;
    @Test
   void setup(){
        WebDriverManager.chromedriver ().setup ();
        driver=new ChromeDriver ();
        driver.get ("https://opensource-demo.orangehrmlive.com/");
       driver.manage ().window ().maximize ();


       String handle=driver.getWindowHandle ();
        System.out.println (handle);


   }


}
