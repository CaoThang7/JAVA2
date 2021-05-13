/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poly.Lab2b1;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author macbook
 */
public class User {
    private String Fullname;
    private String password;
    private String Role;
    
    public void setFullname(String fullname){
     this.Fullname=fullname;       
}
      public String  getFullname(){
       return this.Fullname;       
}
      
         public void setPass(String pass){
     this.password=pass;       
}
      public String  getPass(){
       return this.password;       
}
      
          public void setRole(String role){
     this.Role=role;       
}
      public String  getRole(){
       return this.Role;       
}

    void setFullname(JTextField Username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setpassword(JPasswordField Pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
