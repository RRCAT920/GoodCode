package Calendar;

import java.time.*;

public class FOP_Calendar___ {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, 7, 15);
        int offset = 2 - date.getDayOfWeek().getValue();
        int len = date.lengthOfMonth();
        System.out.println("Mon\tFeb\tWed\tThu\tFri\tSat\tSun");
        for (int i = offset; i <= len; ++i) {
            if (i <= 0) {
                System.out.print("\t");
            }
            else {
                System.out.printf("%3d", i);
                if (i == date.getDayOfMonth()) {
                    System.out.print("*");
                }
                if ((i - offset + 1) % 7 == 0) {
                    System.out.println();
                }
                else {
                    System.out.print("\t");
                }
            }
        }
    }
}
