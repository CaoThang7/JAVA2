
public class MainClassEx1 {
    public static void main(String[]args){
        MyThread thread1=new MyThread();
         MyThread thread2=new MyThread();
         
         Thread th1=new Thread(thread1);
          Thread th2=new Thread(thread2);
          
          th1.setPriority(Thread.MAX_PRIORITY);
          th2.setPriority(Thread.MIN_PRIORITY);
          
          th1.start();
          
          th2.start();
          
          System.out.println("Complete!");
    }
}
