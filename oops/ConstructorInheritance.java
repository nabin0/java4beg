class A {
    A() {
        System.out.println("Iam constructor of A with 0 arguments.");
    }

    A(int a) {
        System.out.println("Iam a constructor of A with 1 arguments.");
    }
}

class B extends A {
    B() {
        super(4); //Super is used to call constructor of super class
    }

    void display() {
        System.out.println("Iam Display function of class B.");
    }
}

public class ConstructorInheritance {

    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}