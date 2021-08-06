class Test {
    int a = 10;

    Test(int a) {
        this.a = a;
    }

    // Constructor overloading
    Test() {
        System.out.println("This is constructor with no paramaters.");
    }

    int geta() {
        return a;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Test a = new Test();
        // Test a = new Test(4);
        System.out.println(a.geta());
    }
}
