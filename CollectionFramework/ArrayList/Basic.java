package CollectionFramework.ArrayList;

import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

         arr.add(34);
         arr.add(32);
         arr.add(67);
         arr.add(314);


        //  for(int a:arr){
        //      System.out.print(a+ " ");
        //  }

        arr.add(4, 56);
        System.out.println(arr.get(4));
    }
}
