import java.lang.reflect.*;

class Task {
    public void work() throws InterruptedException { Thread.sleep(400); }
}

public class Timing {
    public static void main(String[] args) throws Exception {
        Task t1 = new Task();
        Method main = Task.class.getMethod("work");
        long start = System.nanoTime();
        main.invoke(t1);
        long end = System.nanoTime();
        System.out.println("Time: " + (end-start)/1_000_000 + " ms");
    }
}