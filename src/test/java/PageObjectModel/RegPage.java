package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPage {
    WebDriver driver;

    By regLink= By.linkText ("REGISTER");
    By firstname= By.name ("firstName");
    By lastname= By.name ("lastName");
    By phone= By.name ("phone");
    By email= By.name ("userName");
    By adress= By.name ("address1");
    By city= By.name ("city");
    By state= By.name ("state");
    By postalcode= By.name ("postalCode");
    By country= By.name ("country");
    By username= By.name (" email");
    By password= By.name ("password");
    By comfirmpassword= By.name ("confirmPassword");
    By submit= By.name ("submit");

    RegPage(WebDriver d){
      driver=d;
    }

    public void clickRegLink(){
        driver.findElement (regLink).click ();
    }
    public void setFirstName(String fname){

        driver.findElement (firstname).sendKeys (fname);
    }
    public void setLastName(String lname){
        driver.findElement (lastname).sendKeys (lname);
    }
    public void setPhone(String pnumber){
        driver.findElement (phone).sendKeys (pnumber);
    }
    public void setEmail(String mail){
        driver.findElement (email).sendKeys (mail);
    }
    public void setAdress(String adres){
        driver.findElement (adress).sendKeys (adres);
    }
    public void setCity(String cityName){
        driver.findElement (city).sendKeys (cityName);
    }
    public  void setState(String statename){
        driver.findElement (state).sendKeys (statename);
    }
    public void setPostalCode(String Pcode){
        driver.findElement (postalcode).sendKeys (Pcode);
    }
    public void setCountry(String CountyrName){
        driver.findElement (country).sendKeys (CountyrName);
    }
    public void setUsername(String user){
        driver.findElement (username).sendKeys (user);
    }
    public void setPassword(String password1){
        driver.findElement (password).sendKeys (password1);
    }
    public void setComfirmPassword(String ComfirmPassword){
        driver.findElement (comfirmpassword).sendKeys (ComfirmPassword);
    }
    public void clickSubmit(){
        driver.findElement (submit).click ();
    }
}
