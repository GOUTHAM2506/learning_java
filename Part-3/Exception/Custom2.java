package Exception;

class BreakNotWorking extends RuntimeException {
    BreakNotWorking(String x) {
        super(x);
    }
}

class Bike {
    static boolean isStoppable = false;

    public static void ride() {
        System.out.println("Bike is running.");
        if (isStoppable)
            System.out.println("Can stop the bike.");
        else
            throw new BreakNotWorking("Can't stop the bike.");

    }
}

public class Custom2 {
    public static void main(String[] args) {
        try {
            Bike.ride();
        } catch (BreakNotWorking b) {
            System.out.println("Exception Handled.");
            System.out.println(b.getMessage());
        }
    }
}
