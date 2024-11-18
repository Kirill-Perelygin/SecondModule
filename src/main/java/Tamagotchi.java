import java.util.Scanner;

public class Tamagotchi {

    static String catName;
    static int catWeight = 3;
    static int catAge = 0;
    static int catHunger = 1;

    public static void main(String[] args) {


        System.out.println("Введите имя кота: ");
        Scanner scanner = new Scanner(System.in);
        catName = scanner.next();

        while(true){
            for (int i = 0; ; i++){
                System.out.println("Меню кота");
                catWeight -= 1;
                catHunger -= 1;
                System.out.println("Вес вашего кота составляет: " + catWeight);
                System.out.println("Голод вашего кота составляет: " + catHunger);
                i++;
            }
        }
    }
}
