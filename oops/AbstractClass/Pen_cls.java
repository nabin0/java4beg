package AbstractClass;

abstract class PenJob {
    abstract void write();

    abstract void refill();
}

class Pen extends PenJob {

    void write() {
        System.out.println("Pen is writing now.");
    }

    void refill() {
        System.out.println("Refilling pen.");
    }
}

class FountainPen extends Pen {
    void changeNib() {
        System.out.println("Pen nib changed.");
    }
}

public class Pen_cls {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.write();
        p.refill();
    }
}
