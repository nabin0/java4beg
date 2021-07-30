class Parent {
    String game;
    int score;

    Parent(String game, int score) {
        this.game = game;
        this.score = score;
    }

    public void getData() {
        System.out.println("Game: " + game + "\nScore: " + score);
    }
}

public class Main {
    public static void main(String[] args) {

        Parent p1 = new Parent("Crcket", 121);
        // p1.game = "Cricket";
        // p1.score = 121;

        p1.getData();

        System.out.println(p1.getClass()); // Returns class name

    }
}
