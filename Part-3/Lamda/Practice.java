package Lamda;

import java.util.Scanner;

interface Calculate {
    int add(int a, int b);

    int sub(int a, int b);
}

public class Practice {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter values of a and b : ");
        a = sc.nextInt();
        b = sc.nextInt();
        Calculate c = new Calculate() {// block of class
            @Override
            public int add(int a, int b) {
                return a + b;
            }

            public int sub(int a, int b) {
                return a - b;
            }
        };
        System.out.println(c.add(a, b));
        System.out.println(c.sub(a, b));
    }
}
