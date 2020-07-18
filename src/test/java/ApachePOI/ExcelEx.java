package ApachePOI;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelEx {
    public static void main(String[] args) throws IOException {
     XSSFCell cell;

        FileInputStream fis=new FileInputStream ("src/list.xlsx") ;
        System.out.println ("---------------Test1");

            XSSFWorkbook wb=new XSSFWorkbook(fis);

            System.out.println ("---------------Test2");
            XSSFSheet s=wb.getSheet ("sheet1");
             int value=s.getLastRowNum ();
             int fvalue=s.getFirstRowNum ();
             int Cvalue=s.getDefaultColumnWidth ();
            for(int i=0;i<=value;i++){
                System.out.print (i+"---");
                for(int j=0;j<=6;j++){

             String values=s.getRow (i).getCell (j).toString ();
                    System.out.print (values+"        ");
                 if(s.getRow (44+i).getCell (j)==null)
                 {
                     cell=s.createRow (44+i).createCell (j);
                     cell.setCellType (CellType.STRING);
                     cell.setCellValue (values+"HEY");
                     }


                    FileOutputStream fos=new FileOutputStream ("src/list.xlsx");
                    wb.write (fos);

                }
                System.out.println ();
            }


        }



    }

