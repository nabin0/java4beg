class Square {
    int sideLength;

    void setLength(int l) {
        this.sideLength = l;
    }

    int getLength() {
        return sideLength;
    }

    double area() {
        return sideLength * sideLength;
    }
}

public class Square_problm {
    public static void main(String[] args) {
        Square s = new Square();
        s.setLength(4);
        System.out.println(s.area());
    }
}
