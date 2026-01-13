package Strings.Level3;

public class UniqueCharacters {

    static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    static char[] uniqueChars(String s) {
        int len = findLength(s);
        char[] temp = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique)
                temp[index++] = s.charAt(i);
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++)
            result[i] = temp[i];

        return result;
    }

    public static void main(String[] args) {
        String text = "programming";
        char[] result = uniqueChars(text);
        for (char c : result)
            System.out.print(c + " ");
    }
}
