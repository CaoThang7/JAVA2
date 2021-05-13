
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Xfile {
     public static byte[] read(String path)throws FileNotFoundException, IOException{ 
     FileInputStream firs=new FileInputStream(path);
     int n=firs.available();
     byte[]data=new byte[n];
     firs.read();
     firs.close();
     return data;
     }
     
    public static void write(String path,byte[]data) throws FileNotFoundException, IOException{ 
        FileOutputStream fos=new FileOutputStream(path);
        fos.write(data);
        fos.close();
    }
    
    public static Object readObject(String path) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream obs=new ObjectInputStream(new FileInputStream(path));
        Object object=obs.readObject();
        obs.close();
        return object;
    }
    
     public static void writeObject(String path,Object object) throws FileNotFoundException, IOException{
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(object);
        oos.close();
    }

   
}
