package Calendar;

import java.time.*;

public class OOP_Calendar___ {
    public static void main(String[] args) {
        // LocalDate date = LocalDate.now();
        LocalDate date = LocalDate.of(2020, 7, 1);
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1);
        int value = date.getDayOfWeek().getValue();

        System.out.println("Mon Fed Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; ++i) {
            System.out.print(" ".repeat(4));
        }

        while (date.getMonthValue() == month) {
            int day = date.getDayOfMonth();
            System.out.printf("%3d%s", day, day == today ? "*" : " ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
        // make a better format
        if (date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }
    }
}
