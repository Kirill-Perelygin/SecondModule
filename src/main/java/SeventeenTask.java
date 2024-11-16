public class SeventeenTask {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Square square = new Square();
        Circle cirle = new Circle();

        System.out.println(triangle.perimiter());
        System.out.println(square.perimiter());
        System.out.println(cirle.perimiter());

    }

    static class Triangle{
        int a = 3;
        int b = 3;
        int c = 3;
        int perimiter;

        private int perimiter(){
            perimiter = a * b * c;
            return perimiter;
        }
    }

    static class Square{
        int a = 4;
        int perimiter;

        private int perimiter(){
            perimiter = a * 4;
            return perimiter;
        }
    }

    static class Circle{
        double r = 15;
        double perimiter;

        private double perimiter(){
            perimiter = Math.round((2 * Math.PI * r) / 100 * 100);
            return perimiter;
        }
    }
}

/*
Написать код расчета периметра равнобедренного треугольника, квадрата, окружности и вывести эти значения в консоль. Параметры для расчета задаются статическими переменными, без ввода с клавиатуры.

Для расчета периметра фигуры необходимо создать свой класс.

Формат вывода:

Perimetr triangle =
Perimetr square =
Perimetr circle =
 */