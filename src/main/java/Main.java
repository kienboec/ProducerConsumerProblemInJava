import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    // https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/BlockingQueue.html
    public static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(5);
    public static boolean done = false;

    public static void main(String[] args){
        Thread producer = new Thread(new Producer());
        producer.start();

        for(int i = 0; i<5;i++){
            Thread consumer = new Thread(new Consumer(i+1));
            consumer.start();
        }
    }
}
