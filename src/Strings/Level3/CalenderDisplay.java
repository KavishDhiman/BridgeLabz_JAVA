package Strings.Level3;

public class CalenderDisplay {

    static boolean isLeap(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }

    static int firstDay(int d, int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
    }

    public static void main(String[] args) {
        int month = 7, year = 2005;
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        if (month == 2 && isLeap(year)) days[1] = 29;

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int start = firstDay(1, month, year);

        for (int i = 0; i < start; i++)
            System.out.print("    ");

        for (int i = 1; i <= days[month - 1]; i++) {
            System.out.printf("%3d ", i);
            if ((i + start) % 7 == 0)
                System.out.println();
        }
    }
}
