
import java.io.Serializable;


public class Student implements Serializable  {
    public String name;
    public double marks;
     public String major;


    public Student(String name, double marks, String major) { this.name = name;
    this.marks = marks;
     this.major = major;
    }
    public String getGrade(){ if(this.marks < 3){
       return "Kém";
    }
        if(this.marks < 5){ 
           return "Yếu";
        }
        if(this.marks < 6.5){
           return "Trung bình"; 
        }
        if(this.marks < 7.5){ 
           return "Khá";
        }
        if(this.marks < 9){
           return "Giỏi"; 
        }
           return "Xuất sắc"; 
        }
    public boolean isBonus(){ 
        return this.marks >= 7.5;
    }
}
