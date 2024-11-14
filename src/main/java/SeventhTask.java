import java.util.Scanner;

public class SeventhTask {
    public static void main(String[] args) {
        int num;
        boolean intRange = true;

        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        if (intRange = num > 1 && num < 100 || num < 0){
            System.out.println(num + " находится в диапазоне от 1 до 100 не включительно или является отрицательным и = " + intRange);
        }
        else {
            System.out.println(num + " не находится в диапазоне от 1 до 100 не включительно или является отрицательным и = " + intRange);
        };
    }
}
