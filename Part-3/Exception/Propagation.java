package Exception;

public class Propagation {

    public static void m1() throws Exception {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            Thread.sleep(500);
        }
    }

    public static void m2() throws Exception {
        System.out.println("I am m2");
        m1();
    }

    public static void m3() throws Exception {
        System.out.println("I am m3");
        m2();
    }

    public static void main(String[] args) {
        try {
            m3();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
