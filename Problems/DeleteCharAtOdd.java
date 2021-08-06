package Problems;

public class DeleteCharAtOdd {
    public static void main(String[] args) {
        String s = "Geeks";

        String newSt = "";

        for(int i = 0; i < s.length(); i++){
            if(i%2 == 0){
                newSt+=s.charAt(i);
            }
            else{
                System.out.println(s.charAt(i) + " Deleted at index "+ i);
            }
        }

        System.out.println("So the final output is : "+newSt);
    }
}
