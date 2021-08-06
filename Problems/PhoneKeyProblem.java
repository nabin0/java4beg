package Problems;


public class PhoneKeyProblem {

    static void printKeyNum(String[] arr, String prblm) {
        for (int i = 0; i < prblm.length(); i++) {
            for(int j = 0; j<arr.length; j++){
                    if(arr[j].indexOf(prblm.charAt(i)) != -1){
                        System.out.print(j);
                    }
            }
        }
    }

    public static void main(String[] args) {

        String[] arr = { " ", "./", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        printKeyNum(arr,"hola");
    }
}
