public class Consumer extends Thread {
    private final int _id;

    public Consumer(int id) {
        _id = id;
    }

    @Override
    public void run() {
        super.run();

        while (!Main.done || !Main.queue.isEmpty()) {
            try {
                Integer item = Main.queue.take();
                System.out.printf("%d took %d%n", this._id, item);
                System.out.flush();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
