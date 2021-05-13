
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


abstract public class DAO <Entity>{
    protected List<Entity>list=new ArrayList<>();
    public void add(Entity entity){
     list.add(entity);
    }
    public void remove(Entity entity){
        list.remove(entity);
    }
    abstract public void update(Entity entity);
    abstract public Entity find(Serializable id);
    public List<Entity>getList(){
     return list;   
    }
    
    public void store(String path)throws FileNotFoundException, IOException, ClassNotFoundException{
//        try{
            FileInputStream fis=new FileInputStream(path);
            ObjectInputStream ois=new ObjectInputStream(fis);
            list=(List<Entity>)ois.readObject();
            ois.close();
            fis.close();
            
//       }catch(Exception e){
//           throw new RuntimeException(e);
//       }
    }
    
    public void load(String path)throws FileNotFoundException, IOException{
//        try{
            FileOutputStream fos =new FileOutputStream(path);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
//        }catch(Exception e){
//            throw new RuntimeException(e);
//        }
    }
}
