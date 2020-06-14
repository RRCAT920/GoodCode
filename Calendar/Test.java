package Calendar;

import java.time.*;

public class Test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date.lengthOfMonth());
        System.out.println(date.lengthOfYear());
    }
}
