package AbstractClass;

class Monkey {
    void jump() {
        System.out.println("I can jump");
    }

    void bite() {
        System.out.println("I can bite.");
    }
}

interface BasicAnimal {

    void eat();

    void sleep();
}

class Human extends Monkey implements BasicAnimal {

    public void eat() {
        System.out.println("I eat food");
    }

    public void sleep() {
        System.out.println("I sleep.");
    }

}

public class Human_class_problem {
    public static void main(String[] args) {
        Human h = new Human();
        h.eat();
        h.sleep();
        h.jump();
        h.bite();
    }
}
