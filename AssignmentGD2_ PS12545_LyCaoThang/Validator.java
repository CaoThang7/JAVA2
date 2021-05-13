
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;


public class Validator {
    public static boolean checkEmpty(JTextField field,StringBuilder sb,String msg){
        boolean ok=true;
        if(field.getText().equals("")){
            sb.append(msg).append("\n");
            field.setBackground(Color.red);
            ok=false;
        }else{
            field.setBackground(Color.white);
    }
        return ok;
    }

    public static boolean checkAge(JTextField field,StringBuilder sb){
             boolean ok=true;
             
             if(!checkEmpty(field, sb, "Tuổi chưa nhập ")){
                 return false;
    
             }
             
             try{
                 int age=Integer.parseInt(field.getText());
                 if(age <18 || age >55){
                     sb.append("Tuổi Không hợp lệ(Nằm ngoài khoảng 18 -55)\n ");
                     field.setBackground(Color.red);
                     ok=false;
                 }
             }catch(Exception e){
                 sb.append("Giá trị tuổi không hợp lệ(Phải là giá trị số)\n");
                 field.setBackground(Color.red);
                 ok=false;
             }
             if(ok){
                 field.setBackground(Color.white);
             }
             
             return ok;
    }
      public static boolean checkSalary(JTextField field,StringBuilder sb){
             boolean ok=true;
             
             if(!checkEmpty(field, sb, "Lương chưa nhập")){
                 return false;
    
             }
             
             try{
                 double salary=Double.parseDouble(field.getText());
                 if(salary <5000000){
                     sb.append("Lương không hợp lệ(Phải > 5.000.000)\n ");
                     field.setBackground(Color.red);
                     ok=false;
                 }
             }catch(Exception e){
                 sb.append("Giá trị lương không hợp lệ(Phải là giá trị số)\n");
                 field.setBackground(Color.red);
                 ok=false;
             }
             if(ok){
                 field.setBackground(Color.white);
             }
             
             return ok;
    }
    
      
      public static boolean checkEmail(JTextField field,StringBuilder sb){
             boolean ok=true;
             
             if(!checkEmpty(field, sb, "Email chua nhap")){
                 return false;
    
             }
             
             
                Pattern pattern =Pattern.compile("\\w+@\\w+\\.\\w+");
                Matcher matcher = pattern.matcher(field.getText());
                
                if(!matcher.find()){
                    sb.append("Email khong hop le\n");
                    field.setBackground(Color.red);
                    ok=false;
                }
                
           
             if(ok){
                 field.setBackground(Color.white);
             }
             
             return ok; 
      }
    
}
