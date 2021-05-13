
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ProductManager {
    public static void main(String[]args) throws IOException, FileNotFoundException, ClassNotFoundException{
//        ProductDAO dao=new ProductDAO();
//        Product p1=new Product("iPhone9",1000.0);
//        Product p2=new Product("Samsung Galaxy",3000.0);
//        
//        
//        dao.add(p1);
//        dao.add(p2);
//        
//        dao.store("/Users/macbook/Downloads/lab8.txt");
//        
//        ProductDAO dao2=new ProductDAO();
//        dao2.load("/Users/macbook/Downloads/Lab8.txt");
//        Product p=dao2.find("iPhone9");
//        System.out.println(">Name:" + p.name);
//        System.out.println(">Price:" + p.price);
        
        
        ProductDAO dao=new ProductDAO();
        List<Product> list = new ArrayList<>();
        list.add(new Product("iPhone9", 1000.0));
        list.add(new Product("Samsung Galaxy", 3000.0));
        
        dao.load("/Users/macbook/Downloads/lap8.txt");
        
        ProductDAO dao2=new ProductDAO();
        List<Product> list2 = new ArrayList<>();
        dao.store("/Users/macbook/Downloads/Lap8.txt");
        
       
        
        for(Product sv : list){
           Product p=dao2.find("iPhone9");
           System.out.println(">Name: " + sv.name);
           System.out.println(">Price:" + sv.price);
    //           System.out.print("da tim thay:"+ p);
        }
        
        
    }
    
}
