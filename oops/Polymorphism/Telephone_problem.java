package Polymorphism;

abstract class Telephone {
    abstract void lift();

    abstract void disconnect();

    abstract void ring();
}

class SmartTelephone extends Telephone {

    void lift() {
        System.out.println("Call Answered");
     }

    void disconnect() {
        System.out.println("Call disconnected");
    }

    void ring() {
        System.out.println("Phone ringing");
    }
    void camera(){
        System.out.println("I have camera and i can take photos.");
    }
}

public class Telephone_problem {
    public static void main(String[] args) {

        Telephone t = new SmartTelephone();
        t.disconnect();
        // t.camera(); // Throws an error


        SmartTelephone s = new SmartTelephone();
        s.ring();
        s.camera();
    } 
}