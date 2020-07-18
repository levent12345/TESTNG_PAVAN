package pages;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPro {

  @DataProvider(name="num")
  Object[][] getData(){
      Object data [][]={{1,2,3},{4,5,6},{7,8,9}};

      return data;
  }

  @Test(dataProvider = "num")
    void test1(int x,int y,int z){
      System.out.println (x+"  "+y+"  "+z);

  }

}
