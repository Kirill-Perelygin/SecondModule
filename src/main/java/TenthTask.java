import java.util.Scanner;

public class TenthTask {
    public static void main(String[] args) {
        char charLetter;

        do {
            System.out.println("Введите char символ: ");
            Scanner scanner = new Scanner(System.in);
            charLetter = scanner.next().charAt(0);

            switch (charLetter) {
                case ('h'):
                    System.out.println("Hello!");
                    break;

                case ('b'):
                    System.out.println("Bye!");
                    break;

                case ('i'):
                case ('m'):
                case ('k'):
                    System.out.println("I can decode!");
                    break;

                default:
                    System.out.println("I don't know this symbol :(");
            };
        }
        while (true)
                ;
    }

    ;
}

/* С помощью оператора switch реализуйте метод «дешифратор», используя программу IntelliJ IDEA.

Расшифровка будет происходить по следующим правилам:

        'h' → "Hello!"
        'i', 'm', 'k' → "I can decode!"
        'b' → "Bye!"
Ни один из указанных → "I don't know these symbols :("
Например, если символ равен 'h', то результатом работы будет слово "Hello".

Заготовка кода:

public class Loader {


}

 */