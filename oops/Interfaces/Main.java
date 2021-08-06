package Interfaces;

//Interfaces...
interface Wifi {
    String[] networkDetails();

    void ping();
}

interface Camera {
    void takePhoto(int n);

    void showImage();
}

interface MediaPlayer {
    void play();

    void pause();

    default void playMusik() {
        System.out.println("This is inbuilt media player");
    }
}

// class ...
class Phone {
    void call(){
        System.out.println("iam a phone and i can call");
    }
}

// Class created using above class and interfacces
class SmartPhone extends Phone implements Camera, MediaPlayer, Wifi {

    public void takePhoto(int n) {
        System.out.println("Taking Photo " + n + " photos taken already.");
    }

    public void showImage() {
        System.out.println("Here are your images.");
    }

    public void play() {
        System.out.println("Playing Media");
    }

    public void pause() {
        System.out.println("Paused Media");
    }

    public String[] networkDetails() {
        String[] arr = { "Ada", "Vivo1990", " akash" };
        return arr;
    }

    public void ping() {
        System.out.println("You ping is 20 m/s");
    }

}

public class Main {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.call();
        s.playMusik();
        s.showImage();
        s.ping();
        s.play();
        s.pause();
    }
}
