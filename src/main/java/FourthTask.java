import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        boolean isLeapYear;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + " год - високосный? " + isLeapYear);
    };
}
