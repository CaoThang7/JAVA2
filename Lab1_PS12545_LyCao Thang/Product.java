
import java.util.Scanner;


public class Product implements DAO {
   
    
    
    private String name;
    private double price;
    
    public Product(){
        
    }
    
    public Product(String name,double price){
        this.name=name;
        this.price=price;   
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setprice(double price){
        this.price=price;
    }
    
    public double getprice(){
        return this.price;
}
    
    
    public double getImportTax(double tax){
        return tax= price*10/100;
}
    public void nhap(){
        Scanner a=new Scanner(System.in);
        System.out.print("Xin mời nhập tên:");
        name=a.nextLine();
        System.out.print("Xin mời nhập giá:");
        price=a.nextDouble();
       
    }
    public String xuatTT(){
        return "tên"+ name + "Giá" + price + "Thue" + getImportTax(10);
   
}
    
    @Override
    public void insert(){
       System.out.println("INSERT:");
    }
    

    @Override
    public void update() {
        System.out.println("update:");
    }

    @Override
    public void delete() {
        System.out.println("delete:");
    }

    @Override
    public void select() {
        System.out.println("select:"); 
    }
    

}
