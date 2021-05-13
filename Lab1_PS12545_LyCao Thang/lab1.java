
import java.util.Scanner;


public class lab1 {
    public static void main(String[]agrs){
        Product a=new Product();
        NoTaxProduct b=new NoTaxProduct(); 
        Scanner c=new Scanner(System.in);
       
        System.out.print("Nhap SP1:");
        c.nextLine();
        a.nhap();
        System.out.print(a.xuatTT());
        
        System.out.print("Nhap SP2:");
        c.nextLine();
        a.nhap();
        System.out.print(a.xuatTT());   
        // SP3 ko thue
        
         System.out.print("Nhap SP3:");
         c.nextLine();
        a.nhap();
        System.out.print(b.xuatTT2());
         System.out.print("Nhap SP4:");
         c.nextLine();
        a.nhap();
        System.out.print(a.xuatTT());
         System.out.print("Nhap SP5:");
         c.nextLine();
        a.nhap();
        System.out.print(a.xuatTT());   
    }
}
