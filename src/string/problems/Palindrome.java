package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String word = "MOM";
        StringBuilder palindrom = new StringBuilder();

        int wordLength = word.length();

        for(int i=0;i<wordLength;i++){
            palindrom.append(word.charAt(wordLength-1-i));
        }

        String revPalindrom = new String(palindrom);

        if(word.matches(revPalindrom)){
            System.out.println("The words are palindrom.");
        }
        else System.out.println("The words are not palindrom.");
    }
}
