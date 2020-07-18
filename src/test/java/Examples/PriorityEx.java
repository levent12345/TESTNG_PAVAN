package Examples;

import org.testng.annotations.Test;

public class PriorityEx {
    @Test (priority = 0)
    void testOne(){
        System.out.println ("This is test 1");
    }
    @Test(priority = 1)
    void testtwo(){
        System.out.println ("This is test 2");
    }
    @Test(priority = 3,enabled = false)
    void testtree(){
        System.out.println ("This is test 3");
    }
    @Test(priority = 4)
    void testfour(){
        System.out.println ("This is test 4");
    }
}
