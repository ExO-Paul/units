package sokolchik.paul.units;

public class Main {


    public static void main(String[] args) {
        Unit[] units = {
                new Archer(),
                new Archer("Keith Green-Hood", 120, 6, 20),
                new Wizard(),
                new Wizard("Harold Long-Beard", 80, 2, 200)
        };

        for (int i = 0; i < 4; i++) {
            System.out.println(units[i].getInfo());
            units[i].run();
            if (units[i] instanceof Archer) {
                ((Archer) units[i]).shoot();
            } else if (units[i] instanceof Wizard) {
                ((Wizard) units[i]).cast();
            } else System.out.println("Nooo can do");
            System.out.println();
        }

        System.out.println(units[3].getInfo());
        MoveCommand move = new MoveCommand(units[3], 5, 2);
        move.execute();
        System.out.println(units[3].getInfo());
        move.undo();
        System.out.println(units[3].getInfo());

    }

}
