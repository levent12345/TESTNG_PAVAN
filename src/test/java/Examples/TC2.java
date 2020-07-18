package Examples;

import org.testng.annotations.*;

public class TC2 {




    @BeforeClass
    void beforeClass(){
        System.out.println ("Before class");
    }
    @AfterClass
    void afterClass(){
        System.out.println ("After class");
    }


    @BeforeMethod
    void beforeMethod(){
        System.out.println ("Before every method");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println ("After every method");
    }
    @Test
    void test3(){
        System.out.println ("This is test3");
    }
    @Test
    void test4(){
        System.out.println ("This is test4");
    }

    @BeforeSuite

    void beforeSuit(){
        System.out.println ("Before suit");
    }

    @AfterSuite
    void afterSuit(){
        System.out.println ("After suit");
    }

}
