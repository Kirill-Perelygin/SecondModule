import java.util.Scanner;

public class Tamagotchi {

    static String catName;
    static int catWeight = 3;
    static int catAge = 0;
    static int catHunger = 1;
    static int menuCallCount;
    static int catChoice;
    static int catActivity;

    public static void main(String[] args) {


        System.out.println("Введите имя кота: ");
        Scanner catNameScanner = new Scanner(System.in);
        catName = catNameScanner.next();
        while (menuCallCount < 20) {
            System.out.println("Меню кота");
            catWeight -= 1;
            catHunger -= 1;
            System.out.println("Вес вашего кота составляет: " + catWeight);
            System.out.println("Голод вашего кота составляет: " + catHunger);
            System.out.println("Выберите желаемое дейстивие: ");
            System.out.println("1. Узнать состояние кота");
            System.out.println("2. Покормить кота");
            System.out.println("3. Поиграть с котом");
            Scanner catChoiceScanner = new Scanner(System.in);
            catChoice = catChoiceScanner.nextInt();

            switch (catChoice){
                case (1):
                    System.out.println("Возраст кота равняется: " + catAge);
                    System.out.println("Вес кота равняется: " + catWeight);
                    if (catHunger >= 0 && catHunger <= 50){
                        System.out.println("Значение голода вашего кота составляет " + catHunger + ". Срочно покормите кота");}
                        else if (catHunger >= 51 && catHunger <= 100){
                            System.out.println("Значение голода вашего кота составляет " + catHunger + ". Срочно покормите кота");
                        }
                    System.out.println("Голод кота равняется: ");
                    break;
                    }

            }

            menuCallCount++;
            System.out.println(menuCallCount);

            if (menuCallCount == 20) {
                menuCallCount = 0;
                catAge += 1;
            }
        }
    }
