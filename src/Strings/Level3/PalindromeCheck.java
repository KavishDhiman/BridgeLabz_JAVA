package Strings.Level3;
public class PalindromeCheck {

    static boolean logic1(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j)
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        return true;
    }

    static boolean logic2(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return logic2(s, i + 1, j - 1);
    }

    static boolean logic3(String s) {
        char[] orig = s.toCharArray();
        char[] rev = new char[orig.length];

        for (int i = 0; i < orig.length; i++)
            rev[i] = s.charAt(orig.length - 1 - i);

        for (int i = 0; i < orig.length; i++)
            if (orig[i] != rev[i]) return false;

        return true;
    }

    public static void main(String[] args) {
        String s = "madam";
        System.out.println(logic1(s));
        System.out.println(logic2(s, 0, s.length() - 1));
        System.out.println(logic3(s));
    }
}
