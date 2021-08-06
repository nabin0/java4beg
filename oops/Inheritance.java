class Parent1 {
    int a;

    public void seta(int a) {
        this.a = a;
    }

    void geta() {
        System.out.println("Value of a : " + a);
    }
}

class Child extends Parent1 {
    int b;

    void setb(int b) {
        this.b = b;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Parent1 p = new Parent1();
        p.seta(12);
        p.geta();
        
        Child p1 = new Child();
        p1.seta(12);
        p1.a = 121;
        p1.geta();
    }
}
