class Phone {
    int price;
    String name;

    Phone() {
        price = 12000;
        name = "Vivo";
    }

    Phone(int price) {
        this.price = price;
    }

    Phone(int price, String name) {
        this.price = price;
        this.name = name;
    }

    void camera() {
        System.out.println("I am Phone and i Have a camera");
    }

    void call() {
        System.out.println("Iam a phone and i have calling functionality.");
    }
}

class SmartPhone extends Phone {
    SmartPhone() {
        System.out.println("Iam constructor of SmartPhone");
    }

    void facebook() {
        System.out.println("Iam a smartphone and i have facebook");
    }

    void call() {
        System.out.println("Iam a SmartPhone and i have calling functionality.");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // SmartPhone s = new Phone(); //throws an error

        Phone p = new SmartPhone();
        // p.facebook(); //Cannot access function of smartphone because the obj we
        // created is referencing the Phone class

        p.call(); // When the same function is overloaded in derived class that func will be
                  // called

    }
}
