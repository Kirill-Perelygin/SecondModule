import java.text.DecimalFormat;
import java.util.Scanner;

public class TwelfthTask {
    public static void main(String[] args) {
        double height;
        int weight;
        double heightSquare;
        double massIndex;
        double roundedHeightSquare;
        double roundedMassIndex;
        do {
            System.out.println("Введите ваш рост в формате (1,87) : ");
            Scanner heightScanner = new Scanner(System.in);
            height = heightScanner.nextDouble();

            System.out.println("Введите ваш вес в формате (50): ");
            Scanner weightScanner = new Scanner(System.in);
            weight = weightScanner.nextInt();

            heightSquare = Math.pow(height, 2);
            roundedHeightSquare = Math.round(heightSquare * 100.0) / 100.0;

            massIndex = weight / roundedHeightSquare;
            roundedMassIndex = Math.round(massIndex * 100.0) / 100.0;
            System.out.println("Ваш индекс массы тела равняется: " + roundedMassIndex);


            if (roundedMassIndex < 16) {
                System.out.println("У вас выраженный дефицит массы тела");
            } else if (roundedMassIndex >= 16 && roundedMassIndex < 18.50) {
                System.out.println("У вас недостаточная масса тела");
            } else if (roundedMassIndex >= 18.50 && roundedMassIndex <= 24.90) {
                System.out.println("У вас нормальная масса тела");
            } else if (roundedMassIndex >= 25 && roundedMassIndex <= 29.90) {
                System.out.println("У вас избыточная масса тела");
            } else if (roundedMassIndex >= 30 && roundedMassIndex <= 34.90) {
                System.out.println("У вас ожирение I степени");
            } else if (roundedMassIndex >= 35 && roundedMassIndex <= 39.90) {
                System.out.println("У вас ожирение II степени");
            } else if (roundedMassIndex >= 40) {
                System.out.println("У вас ожирение III степени");
            }
            ;
        } while (true);
    };
}
