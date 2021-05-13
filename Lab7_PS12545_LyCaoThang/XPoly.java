/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author MyPC
 */
public class XPoly {
    @Deprecated
    public static boolean isCardNumber(String number){
        int tong = 0;
        int s = Integer.parseInt(number);
           while(s>0){
               int a =s % 10;
               s =s/10;
               tong+=s;
           }
//        System.out.println(tong);
        if(tong%2==0){
            return true;
        }else{
            return false;
        }
        
    }
 
}
