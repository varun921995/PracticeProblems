package ThreadingPart1;

public class World extends Thread{

    public void run(){
        for(;;){
            System.out.println("world");
        }
    }
}
