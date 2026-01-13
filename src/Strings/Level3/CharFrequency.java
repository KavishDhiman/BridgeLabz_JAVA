package Strings.Level3;

public class CharFrequency {

    static String[][] frequency(String s) {
        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;

        String[][] result = new String[s.length()][2];
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freq[c] != 0) {
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(freq[c]);
                freq[c] = 0;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[][] res = frequency("banana");
        for (String[] r : res)
            if (r[0] != null)
                System.out.println(r[0] + " : " + r[1]);
    }
}
