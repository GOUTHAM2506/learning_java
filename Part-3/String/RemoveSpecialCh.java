package String;

public class RemoveSpecialCh {
    public static void main(String[] args) {
        String s = "S@at@an#u! Gou#t5H!AM SUD&%HA@$RS%AN";
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ')
                res += c;
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
                res += c;
        }
        System.out.println(res);
    }
}       