package Java_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int v = sc.nextInt();
        int t = v;
        int size = 0;
        while (t > 0) {
            size++;
            t /= 10;
        }
        t = v;
        int a[] = new int[size];
        int i = a.length - 1;
        while (t > 0) {
            a[i] = t % 10;
            t /= 10;
            i--;
        }
        int r = a.length - 1;
        a[r] += 1;
        while (r >= 0) {
            if (a[r] > 9) {
                a[r] = 0;
                a[r - 1] += 1;
            }
            r--;
        }
        System.out.println(Arrays.toString(a));
    }
}
