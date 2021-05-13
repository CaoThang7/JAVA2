
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbook
 */
public class TestThread {
    public static void main(String[] args) {
        OddThread th1=new OddThread();
        EvenThread th2=new EvenThread();
        
        System.out.println("Các số lẻ: ");
        th1.start();
        try {
            th1.join();
        } catch (InterruptedException ex) {
           
        }
        
        th2.start();
        
        System.out.println("Các số chẵn: ");
        
    }
}
