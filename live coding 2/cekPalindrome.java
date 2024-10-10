import java.util.*;

public class cekPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan kata yang ingin dicek:");
        String kata = in.nextLine();
        boolean PalindromeFlag = true;

        for (int i=0; i<kata.length(); i++) {
            int j = kata.charAt(kata.length() - 1 - i);
            int c = kata.charAt(i);
            if (c != j) {
                System.out.println(kata + " bukan kata palindrome.");
                PalindromeFlag = false;
                break;
            }
        }

        if (PalindromeFlag) {  //kalau bukan palindrome
            System.out.println(kata + " adalah kata palindrome.");
        }
    }
}