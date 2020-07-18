package ApachePOI;

import java.io.*;
import java.util.Scanner;

public class FileRE {
    public static void main(String[] args) throws IOException {
//1. WAY READING
    FileReader fr=new FileReader ("src/sser.txt") ;
    BufferedReader br=new BufferedReader (fr);
    String str;

    while((str=br.readLine ())!=null){
        System.out.println (str); }
      br.close ();

//2. WAY READING
        File fl=new File ("src/sser.txt");
        Scanner sc=new Scanner (fl);
        while(sc.hasNextLine ()){
            System.out.println (sc.nextLine());
        }

//3. WAY READING
        File fl1=new File ("src/sser.txt");
        Scanner sc1=new Scanner (fl1);
}}
