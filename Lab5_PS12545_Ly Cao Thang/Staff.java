
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class Staff implements Serializable{
    public String fullname;
    public double salary;
    
     Staff() {
        
    }
    
    public Staff(String fullname,double salary){
        this.fullname= fullname;
        this.salary=salary;
    }

   

    
}
