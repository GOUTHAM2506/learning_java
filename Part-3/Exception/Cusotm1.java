package Exception;

//Checked cusotm exception
class NotStuding extends Exception {
    NotStuding(String msg){
        super(msg);
    }
}

public class Cusotm1 {
    public static void school() throws NotStuding {
        int marks = 30;
        if(marks >= 50) System.out.println("Very Good");
        else throw new NotStuding("Very Bad");
    }

    public static void main(String[] args) {
        try {
            school();
        } catch (NotStuding n) {
            System.out.println(n.toString());
        }
    }
}
