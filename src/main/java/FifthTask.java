import java.sql.SQLOutput;
import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        System.out.println("Введите плюс или равно:");
        Scanner scanner = new Scanner(System.in);
        char i = scanner.next().charAt(0);
        System.out.println(i);

        if (i == '+'){
            System.out.println("Введен плюс");
        }
        else if (i == '='){
            System.out.println("Введно равно");
        }
        else
            System.out.println("Введено некорректное значение");
    };
}
