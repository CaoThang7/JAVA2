
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Test {
    public static void main(String[]args)throws  IOException, FileNotFoundException, ClassNotFoundException{
        Xfile xfile=new Xfile();
        List<Student> list = new ArrayList<>();
        list.add(new Student("Tuấn", 5, "CNTT"));
        list.add(new Student("Cường", 7.5, "TKTW"));
        list.add(new Student("Hạnh", 8.5, "CNTT"));
        Xfile.writeObject("/Users/macbook/Downloads/lap5.txt", list);
        
        List<Student> list2 =(List<Student>) Xfile.readObject("/Users/macbook/Downloads/lap5.txt");
        for(Student sv : list){
           System.out.println(">Họ và tên: " + sv.name);
        }
        
    }
}
