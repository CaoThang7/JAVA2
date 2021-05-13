
public class EvenThread extends Thread{
    public void run(){
        for(int i=0;i<20;i+=2){
            System.out.print(" " + i);
            try{
                Thread.sleep(15);
            }catch(InterruptedException ex){
                
            }
            System.out.println();
        }
    }
}
