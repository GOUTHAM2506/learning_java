package WrapperClass;

public class Auto {
    public static void main(String[] args) {
        int a = 10;
        // Auto Boxing
        Integer ob1 = a;
        System.out.println(ob1.toString());
        // Auto Unboxing
        int b = ob1;
        System.out.println(b);
    }
}
