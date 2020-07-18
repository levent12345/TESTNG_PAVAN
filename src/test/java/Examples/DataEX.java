package Examples;

import org.testng.annotations.DataProvider;

public class DataEX {

    @DataProvider(name="numbers")
    public Object[][] getData(){

        Object[][] data={{11,22,32},{44,55,66},{77,88,99}};
        return data;
    }
}
