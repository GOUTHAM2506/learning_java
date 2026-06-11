package String;

public class Program1 {
    public static void main(String[] args) {

        // ! How to know length of a string
        String msg = "RCB has won but RCB fans are lost.";
        int len = msg.length();
        System.out.println("The length of " + msg + " is " + len);

        // ! Character at -> charAt()
        System.out.println(msg.charAt(6));

        // ! indexOf()
        System.out.println(msg.indexOf('a'));
        System.out.println(msg.indexOf('h'));
        // To give the other character's/last character's index
        System.out.println(msg.lastIndexOf('a'));

        // ! To make every character uppercase
        String greet = "Good Morning";
        String upper = greet.toUpperCase();
        System.out.println(greet);
        System.out.println(upper);

        System.out.println("------------------------");

        // ! To make every character lowercase
        String lower = greet.toLowerCase();
        System.out.println(greet);
        System.out.println(lower);

        
    }
}
