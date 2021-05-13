
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;


public class ClockThread extends Thread{
    private JLabel button;

    public ClockThread(JLabel button) {
        this.button = button;
    }

  
    
    
    
    @Override
    public void run() {
        SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss aa");
        while (true) {            
            Date now = new Date();
            String st= sdf.format(now);
            button.setText(st);
            
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex){
                
            }
            
        }
            
    }
}
