package DisplayNumberofMonth;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthNumber;
        int year;

        while (true) {
            System.out.print("Enter a month (name, abbreviation, or number): ");
            String monthInput = scanner.next().toLowerCase();
            monthNumber = convertMonthToNumber(monthInput);
            if (monthNumber < 1 || monthNumber > 12) {
                System.out.println("Invalid month. Please try again.");
                continue;
            }

            System.out.print("Enter a year (non-negative number): ");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                if (year >= 0) {
                    break;
                } else {
                    System.out.println("Year cannot be negative. Please try again.");
                }
            } else {
                System.out.println("Invalid year. Please enter all digits of a year.");
                scanner.next(); 
            }
        }

        int daysInMonth = getDaysInMonth(monthNumber, year);
        System.out.printf("Number of days: %d\n", daysInMonth);
    }

    private static int convertMonthToNumber(String month) {
        month = month.toLowerCase();
        switch (month) {
            case "january":
            case "jan.":
            case "jan":
            case "1":
                return 1;
            case "february":
            case "feb.":
            case "feb":
            case "2":
                return 2;
            case "march":
            case "mar.":
            case "mar":
            case "3":
                return 3;
            case "april":
            case "apr.":
            case "apr":
            case "4":
                return 4;
            case "may":
            case "5":
                return 5;
            case "june":
            case "jun":
            case "6":
                return 6;
            case "july":
            case "jul":
            case "7":
                return 7;
            case "august":
            case "aug.":
            case "aug":
            case "8":
                return 8;
            case "september":
            case "sept.":
            case "sept":
            case "9":
                return 9;
            case "october":
            case "oct.":
            case "oct":
            case "10":
                return 10;
            case "november":
            case "nov.":
            case "nov":
            case "11":
                return 11;
            case "december":
            case "dec.":
            case "dec":
            case "12":
                return 12;
            default:
                return -1; // Invalid month
        }
    }

    private static int getDaysInMonth(int monthNumber, int year) {
        switch (monthNumber) {
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    private static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
}