public class MultiplicationTable {
    public static void main(String[] args) {
        // Отобразить название таблицы
        System.out.println("\t\t\t\tТАБЛИЦА УМНОЖЕНИЯ\n");
        // Добавляем дополнительный табулятор для выравнивания
        System.out.print("\t");
        // Отобразить имена столбцов
        for (int j = 1; j <= 9; j++)
            System.out.print("\t" + j);

        // Добавлен еще один таб System.out.println("\n\t\t_\t_\t_\t_\t_\t_\t_\t_\t_");

        // Отобразить имена строк и произведение
        for (int i = 1; i <= 9; i++) {
            // Добавляем дополнительный табулятор для выравнивания строк
            System.out.print(i + " |");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("\t" + i * j);
            }
            System.out.println();
        }
    }
}