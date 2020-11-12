public class Producer implements Runnable {
    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            try {
                Main.queue.put(i+1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Main.done = true;
    }
}
