package sokolchik.paul.units;

/**
 * Created by sokolchik_p on 20.08.2014.
 */
public class Wizard extends Unit {
    protected int mana = 100;

    public Wizard() {
        super();
    }

    public Wizard(String name, int health, int velocity, int mana) {
        super(name, health, velocity);
        //Здесь и далее закомментрованный код - для неабстрактного метода
        /*this.name = name;
        this.health = health;
        this.velocity = velocity;*/
        this.mana = mana;
    }

    public void run() {
        System.out.println("Wizard " + name + " breaks to run, his velocity is " + velocity);
    }

    public void cast() {
        mana -= 10;
        System.out.println(name + " makes some mysterious passes with his hands and a huge fireball flies towards the enemy\n" +
                "after such miracle, he has " + mana + "% of his power left");
    }

    @Override
    public String getInfo() {
        return "Wizard " + name + " is on position ("+x+", "+y+"), " + health + "% healthy, can run on " + velocity + "kph and has " + mana + "% of his power left";
    }
}
