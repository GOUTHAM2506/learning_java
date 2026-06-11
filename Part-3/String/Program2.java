package String;

import java.util.Scanner;

public class Program2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your email : ");
        String email1 = sc.next();
        System.out.print("Enter your email again : ");
        String email2 = sc.next();
        if (email1.equals(email2))
            System.out.println("Both the email are same.");
        else
            System.out.println("Both email are not same");
    }
}
