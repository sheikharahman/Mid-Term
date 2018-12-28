package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        permutation("297");

    }
    public static void permutation(String input){
        permutation("input");
    }
    private static void permutation(String prm, String wrd){
        if(wrd.isEmpty()){
            System.out.println(prm+wrd);
        }
        else{
            for(int i=0;i<wrd.length();i++){
                permutation(prm+wrd.charAt(i),wrd.substring(i +1,wrd.length()));
            }
        }
    }
}
