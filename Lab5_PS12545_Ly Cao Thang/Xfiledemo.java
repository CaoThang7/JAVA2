

import java.io.IOException;


public class Xfiledemo {
    public static void main(String[]args)throws  IOException{
        Xfile xfile=new Xfile();
        byte[]data=xfile.read("/Users/macbook/Downloads/a1.txt");
        xfile.write("/Users/macbook/Downloads/a2.txt",data);
        
    }
}
