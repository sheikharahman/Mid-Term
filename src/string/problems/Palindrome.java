package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String world1 ="long";
        String word2="short";
        checkPlaindrome(world1);
        checkPlaindrome(word2);
        checkPlaindrome("fails");
        checkPlaindrome("Water");

    }
    public static void checkPlaindrome(String word){
        String chkp = word.toLowerCase();
        String reverse ="";
        for(int i = chkp.length()-1;i>=0;i--){
            reverse =reverse+chkp.charAt(i);

        }
        if(chkp.equals(reverse)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }

}
