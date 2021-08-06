package Inheritance;

class Circle {
    int r;
    double pi = 3.1416;

    Circle() {
        System.out.println(
                "You should provide r value using constructor with one argument other default value of r will be 1.");
    }

    Circle(int r) {
        this.r = r;
    }

    public double area() {
        return pi * r * r;
    }

}

class Cylinder extends Circle {
    int h;

    Cylinder(int r, int h) {
        super(r);
        this.h = h;
    }

    @Override
    public double area() {
        return (2 * pi * r * (r + h));
    }

    double volume() {
        return Math.PI * r * r * h;
    }
}

public class circle_to_cylinder {
    public static void main(String[] args) {
        Circle cr = new Circle(5);
        System.out.println(cr.area());

        Cylinder c = new Cylinder(4, 10);
        System.out.println(c.area());
        System.out.println(c.volume());
    }

}