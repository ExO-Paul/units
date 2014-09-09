package sokolchik.paul.units;

/**
 * Created by sokolchik_p on 20.08.2014.
 */
public class Archer extends Unit {
    protected int arrows = 10;

    public Archer() {
        super();
    }

    public Archer(String name, int health, int velocity, int arrows) {
        super(name, health, velocity);
        //Здесь и далее закомментрованный код - для неабстрактного метода
        /*this.name = name;
        this.health = health;
        this.velocity = velocity;*/
        this.arrows = arrows;
    }

    public void run() {
        System.out.println("Archer " + name + " breaks to run, his velocity is " + velocity);
    }

    public void shoot() {
        arrows--;
        System.out.println(name + " quickly draws his bow and shoots his arrow into the foe\n" +
                "He has " + arrows + " arrows left");
    }

    public String getInfo() {
        return "Archer " + name + " is on position ("+currentPos.x+", "+currentPos.y+"), " + health + "% healthy, can run on " + velocity + "kph and has " + arrows + " arrows left";
    }

}
