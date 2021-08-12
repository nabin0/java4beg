package CollectionFramework.ArrayDequeue;

import java.util.ArrayDeque;

public class Arrdequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.add(23);
        d.addFirst(5454);
        System.out.println(d.getFirst());
    }
}
