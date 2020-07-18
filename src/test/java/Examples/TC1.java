package Examples;

import org.testng.annotations.*;

public class TC1 {

    @BeforeTest
    void beforeTest(){
        System.out.println ("Before test");
    }
@AfterTest
void afterTest(){
    System.out.println ("After test");
}

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
    void test1(){
        System.out.println ("This is test1");
    }
    @Test
    void test2(){
        System.out.println ("This is test2");
    }

}
