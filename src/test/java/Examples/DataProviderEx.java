package Examples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {

    @Test(dataProvider = "numbers",dataProviderClass = DataEX.class)
    void login(int x,int y,int z){
        System.out.println ("x: "+x+" y: "+y+" z: "+z);
    }




//    @DataProvider(name="numbers")
//    public Object[][] getData(){
//
//        Object[][] data={{1,2,3},{4,5,6},{7,8,9}};
//        return data;
//    }




}
