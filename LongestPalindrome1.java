import java.util.HashSet;

public class LongestPalindrome1 {

    public static int longestPalindrome(String s) {
        char charArr[] = s.toCharArray();
        HashSet<Character> potentialForPair = new HashSet<>();
        int palindromeLength = 0;
        for(char _char: charArr) {
            if(potentialForPair.contains(_char)) {
                potentialForPair.remove(_char);
                palindromeLength = palindromeLength + 2;
            } else{
                potentialForPair.add(_char);
            }
        }
        if(!potentialForPair.isEmpty()) {
            palindromeLength++;
        }

        return palindromeLength;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println("Longest Palindrome Length : " + longestPalindrome(s));
    }
}
