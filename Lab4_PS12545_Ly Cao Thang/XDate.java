
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class XDate {
   private static SimpleDateFormat formater=new SimpleDateFormat();
   public static Date parse(String text,String pattern)throws RuntimeException, ParseException{
       try{
          formater.applyPattern(pattern);
          return formater.parse(text);
       }catch(Exception e){
           throw new RuntimeException(e);
   }
   }
   public static Date parse(String text) throws RuntimeException, ParseException{
       return XDate.parse(text,"dd-MM-yyyy");
   }

    static Date parse(Date ngaysinh, String ddMMyyyy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 
