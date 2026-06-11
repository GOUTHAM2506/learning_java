package String;

public class CaseChange {
    public static void main(String[] args) {
        String s = "GoUTHaM";
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 97 && ch <= 122)
                ch -= 32;
            else if (ch >= 65 && ch <= 90)
                ch += 32;
            s2 += ch;
        }
        System.out.println(s2);
    }
}
