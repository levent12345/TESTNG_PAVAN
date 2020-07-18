package Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest {
    @Test(priority = 1)
    void setup(){
        System.out.println ("Opening browser");
    }
    @Test(priority = 3)
    void searchCustomer(){
        System.out.println ("This is searchCustomer test");
        Assert.assertEquals ("a","a");
    }
    @Test(priority = 2)
    void addCustomer(){
        System.out.println ("This is addCustomer test");
    }
    @Test(priority = 4)
    void teardown(){
        System.out.println ("Closing Browser");
    }
}

