package ThreadingPart2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Threading part 2");
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
