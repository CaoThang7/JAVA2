
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.xml.crypto.Data;


public class SoXoKienThiet extends Thread{
    private JTextField txt;

    public SoXoKienThiet(JTextField txt) {
        this.txt = txt;
    }
     
    
    public void run(){
        Date now =new Date();
        Random rnd=new Random(now.getTime());
        for (int i = 0; i < 1000; i++) {
            
            
            // sinh gia tri ngau nhien tu 0->9(chia lay du 10(cac so du tu 0->9))
            
            //Math.abs lấy giá trị tuyết đối số dương(Không lấy số âm)
            int num=Math.abs(rnd.nextInt() % 10);
            
            //Hien thi so
            txt.setText(" " + num);
            try {
                //sleep 20 mili s( so cang lon cang hien thi cham hon) 
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                
            }
            
        }
    }
    
}
