public class FifteenTask {

    public static void main(String[] args) {
        Elf elf = new Elf();
        Ork ork = new Ork();

        elf.elfName = "Aragorn";
        elf.elfHealth = 100;
        elf.elfDamage = 5;

        ork.orkName = "Saruman";
        ork.orkHealth = 35;
        ork.orkDamage = 10;

            int i;
            for (i = 1; ; i++) {
                elf.elfHealth = elf.elfHealth - ork.orkDamage;
                ork.orkHealth = ork.orkHealth - elf.elfDamage;
                System.out.println("Здоровье эльфа равняется " + elf.elfHealth);
                System.out.println("Здоровье орка равняется " + ork.orkHealth);
                System.out.println("Количетсво шагов равняется: " + i);

                if (elf.elfHealth == 0) {
                    elf.elfIsAlive = false;
                    System.out.println("Орки победили");
                    break;
                }

                if (ork.orkHealth == 0) {
                    elf.elfIsAlive = false;
                    System.out.println("Эльфы победили");
                    break;

            }
        }
    }

    static class Elf {
        String elfName;
        int elfHealth;
        int elfDamage;
        boolean elfIsAlive;

    }

    static class Ork {
        String orkName;
        int orkHealth;
        int orkDamage;
        boolean orkIsAlive;
    }
}