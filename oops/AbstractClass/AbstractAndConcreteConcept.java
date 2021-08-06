package AbstractClass;

//Abstract class with abstract mehtods: we cannot create instances of abstract class
abstract class AbstractClass {
    int val;

    AbstractClass() {
        System.out.println("Iam a constructor of abstract class");
    }

    void speaks() {
        System.out.println("Welcome to the club.");
    }

    abstract void displayData();
}

// Concrete class : we can create instances of concrete class
class Der1 extends AbstractClass {

    void displayData() {
        System.out.println("Iam der1 class displayData function.");
    }
}

// Another concrete class of AbstractClass
class Der2 extends AbstractClass {
    void displayData() {
        System.out.println("Iam display method of class Der2");
    }
}


//Deriving new class from der1

class Der3 extends Der1{
    void printData(){
        System.out.println("Iam printing data of Der3");
    }
}
public class AbstractAndConcreteConcept {
    public static void main(String[] args) {

        // AbstractClass a = new AbstractClass(); //Throws an error
        Der1 d = new Der1();
        d.displayData();

        Der2 d2 = new Der2();
        d2.displayData();

        Der3 d3 = new Der3();
        d3.displayData();
    }
}
