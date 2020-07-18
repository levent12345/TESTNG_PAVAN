package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRpage {
//By username=By.id ("txtUsername");
//    By password=By.id ("txtPassword");
//    By login=By.id ("btnLogin");


    @FindBy(id="txtUsername")
    public WebElement username;
    @FindBy(id="txtPassword")
    public WebElement password;
    @FindBy(id="btnLogin")
    public WebElement login;








}
