
public class Try {
    public static int firstUniqChar(String s) {
        int arr[] = new int[s.length()];
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (arr[i] == 1)
                if (s.charAt(i) == s.charAt(j) && i != j) {
                    arr[i] = 1;
                    arr[j] = 1;
                    i++;
                    j = s.length();
                }
            j--;
        }
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == 0)
                return k;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabb"));
    }

}
