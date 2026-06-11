package Lamda;

interface Calculate {
    int add(int a, int b);
}

// class A implements Calculate {
// @Override
// public void add() {
// System.out.println("I am add method");
// }
// }

public class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Calculate c = new Calculate() {// block of class
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println(c.add(a, b));
    }
}
