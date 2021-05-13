
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ghi {
   public static void main(String[]args)throws FileNotFoundException{ 
       // tao file
       FileOutputStream fos=new FileOutputStream("/Users/macbook/Downloads/a1.txt");
       // choi can ghi
       String chuoi="ggg";
       //chuyen sang byte
       byte[]b=chuoi.getBytes();
       try {
           fos.write(b);
       } catch (IOException ex) {
           Logger.getLogger(Ghi.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
}
