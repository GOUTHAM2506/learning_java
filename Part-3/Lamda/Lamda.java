package Lamda;

@FunctionalInterface
interface Operation {
    void multiply();
}

interface Operation2 {
    void divison(int a, int b);
}

interface Operation3 {
    int addition(int a, int b);
}

public class Lamda {
    public static void main(String[] args) {
        // lamda expression without parameters
        Operation op = () -> {
            System.out.println("Multiply is " + (2 * 4));
        };
        // lamda expression with parameters
        op.multiply();
        Operation2 op2 = (a, b) -> {
            System.out.println("Division is " + a / b);
        };
        // lamda expression with return type
        op2.divison(20, 5);
        Operation3 op3 = (a, b) -> a + b;

        System.out.println("Addition is " + op3.addition(30, 60));
    }
}
