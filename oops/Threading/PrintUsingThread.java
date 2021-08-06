package Threading;

class Thr1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Welcome!!!");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                System.out.println("Some Exception occured");
                e.printStackTrace();
            }
        }
    }
}

class Thr2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Good morning.");
        }
    }
}

public class PrintUsingThread {
    public static void main(String[] args) {

        Thr1 t1 = new Thr1();
        Thr2 t2 = new Thr2();
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        // System.out.println(t1.getPriority());
        // System.out.println(t1.getState());
        // System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());

    }
}