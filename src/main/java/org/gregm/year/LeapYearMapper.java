package org.gregm.year;

public class LeapYearMapper {
    public static boolean checkLeapYear(int year) {
        if ( isDividedByFour(year) && isDividedby400AndNot100(year)) {
            return true;
        }else {
            return false;
        }
    }

    private static boolean isDividedby400AndNot100(int year) {
        return year % 100 != 0 || year % 400 == 0;
    }

    private static boolean isDividedByFour(int year) {
        return year % 4 == 0;
    }
}
