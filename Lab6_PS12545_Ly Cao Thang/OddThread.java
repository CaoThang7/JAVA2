
public class OddThread extends Thread{
    public void run(){
        for(int i=1;i<20;i+=2){
            System.out.print(" " + i);
            try{
                Thread.sleep(10);
            }catch(InterruptedException ex){
                
            }
            System.out.println();
        }
    }
}
