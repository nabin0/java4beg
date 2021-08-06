package Threading;

class T1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Iam Thead 1");
        }
    }
}

class T2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Iam Thead 2");
        }
    }
}

public class Threading {
    public static void main(String[] args) {
        System.out.println("This is Threading file");

        T1 t1 = new T1();
        T2 t2 = new T2();
        t1.start();
        t2.start();

    }
}
