public class SecondTask {
public static void main(String[] args) {
    int i;
    int j;
    // отобразить верхнюю половину и центральный ряд
    for (i = 1; i <= 6; ++i) {
        for (j = 0; j < i; ++j)
            System.out.print("  " + j);
        System.out.println();
    };

// отобразить нижнюю половину
    for (i = 5; i > 0; --i) {
        for (j = 0; j < i; ++j)
            System.out.print("  " + j);
        System.out.println();
    };
};
}

