package String;

public class Panagram {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        s = s.toLowerCase();
        int ch[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                ch[c - 'a'] = 1;
            }
        }
        int sum = 0;
        for (int i = 0; i < ch.length; i++) {
            sum += ch[i];
        }
        if (sum == 26)
            System.out.println("Panagram");
        else
            System.out.println("Not Panagram");
    }
}
