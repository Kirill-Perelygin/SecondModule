import java.util.Scanner;

public class Tamagotchi {

    static String catName;
    static int catWeight = 10;
    static int catAge = 0;
    static int catHunger = 1;
    static int menuCallCount;
    static int catChoice;
    static int catActivity;
    static int catCanFood = 10;
    static int catFreshFood = 15;
    static int catFood;

    public static void main(String[] args) {


        System.out.println("Введите имя кота: ");
        Scanner catNameScanner = new Scanner(System.in);
        catName = catNameScanner.next();
        while (menuCallCount < 20) {
            System.out.println("Меню кота");
            catWeight -= 1;
            catHunger -= 1;
            if (catWeight < 0 || catActivity < 0 || catHunger < 0) {
                System.out.println("Вы проиграли");
                break;
            }
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
                            System.out.println("Значение голода вашего кота составляет " + catHunger + ". Ваш не нуждается в еде");
                        };
                        if (catActivity >= 0 && catActivity <= 50){
                            System.out.println("Ваш кот активен на: " + catActivity + " процентов. Срочно поиграйте с котом");
                        }
                        else if (catActivity >= 51 && catActivity <= 100){
                            System.out.println("Ваш кот активен на: " + catActivity + " процентов. Ваш кот не нуждается в играх");
                        }
                    break;
                case (2):
                    if (catHunger < 50) {
                        System.out.println("Вес вашего кота составляет " + catHunger + " очков. Срочно покормите кота");
                        System.out.println("Выберите чем покормить кота: ");
                        System.out.println("1. Еда из банки");
                        System.out.println("2. Свежая еда");
                        Scanner catFoodScanner = new Scanner(System.in);
                        catFood = catFoodScanner.nextInt();

                        switch (catFood){
                            case (1):
                                catHunger += catCanFood;
                                System.out.println("новый вес вашего кота равняется " + catHunger);
                                break;
                            case(2):
                                catHunger += catFreshFood;
                                System.out.println("новый вес вашего кота равняется " + catHunger);
                                break;
                            default:
                                ;
                        }
                    }
                        else if (catHunger >= 50 && catHunger <= 100) {
                        System.out.println("Ваш кот сейчас не голоден");
                    }

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
