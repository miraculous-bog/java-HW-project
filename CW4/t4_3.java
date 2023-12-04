package CW4;

public class t4_3 {
    public static void main(String[] args) {
        int startYear = 1;
        int endYear = 400;

        int leapYears = countLeapYears(startYear, endYear);

        System.out.println("Кількість високосних років в інтервалі " + startYear + " - " + endYear + ": " + leapYears);
    }

    public static int countLeapYears(int startYear, int endYear) {
        int leapYearCount = 0;

        for (int year = startYear; year <= endYear; year++) {
            if (isLeapYear(year)) {
                leapYearCount++;
            }
        }

        return leapYearCount;
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}