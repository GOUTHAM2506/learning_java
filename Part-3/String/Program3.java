package String;

import java.util.Scanner;

public class Program3 {
    static Scanner sc = new Scanner(System.in);

    public static boolean checkPalindrome(String o1) {
        o1 = o1.toLowerCase();
        char orr[] = o1.toCharArray();
        int i = 0, j = orr.length - 1;
        while (i < j) {
            if (orr[i] != orr[j])
                return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter a Stirng : ");
        String o1 = sc.next();
        if (checkPalindrome(o1))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
