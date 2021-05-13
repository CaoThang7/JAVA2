
import java.util.ArrayList;


public class Lab8b1 {
    @SuppressWarnings("unchecked")
    public static void main(String[]args){
      ArrayList mylist =new ArrayList();
      mylist.add(10);
      mylist.add("Hello");
      mylist.add(true);
      mylist.add(15.75);
      
      int a=(Integer)mylist.get(0);
      String str=(String)mylist.get(1);
      Double b=(Double)mylist.get(3);
      boolean c=(boolean)mylist.get(2);
      
        System.out.println(a + "\n"+ str + "\n" + b + "\n" + c);
    } 
}
