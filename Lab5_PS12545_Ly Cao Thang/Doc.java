
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Doc {
    public static void main(String[]args)throws FileNotFoundException, IOException{
        
        //Khai bao luong doc
       FileInputStream fis=new FileInputStream("/Users/macbook/Downloads/a1.txt"); 
       int doc;
       //check khong phai cuoi file
       while((doc=fis.read()) !=-1){
           
           
           //ep kieu sang kieu char, in ra
           System.out.print((char)doc);
       }
    }
} 


