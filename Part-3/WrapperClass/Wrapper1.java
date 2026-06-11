package WrapperClass;

public class Wrapper1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("A is " + a);
        // Boxing (Converting any Primitive datatype into Non-Primitive datatype Object)
        Integer ob1 = Integer.valueOf(a);
        System.out.println(ob1);
        byte b = 20;
        System.out.println("B is " + b);
        Byte ob2 = Byte.valueOf(b);
        System.out.println(ob2);
        // Unboxing (Coverting Objects (Non-Primitive datatype) into Primitive datatype)
        int c = ob1.intValue();
        System.out.println(c);
    }
}
