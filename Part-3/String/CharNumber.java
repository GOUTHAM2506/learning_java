package String;

public class CharNumber {
    public static void main(String[] args) {
        String s = "J5a9v6a";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9')
                sum += c - 48;
        }
        System.out.println(sum);
    }
}
