package sokolchik.paul.units;

/**
 * Created by sokolchik_p on 20.08.2014.
 */
public abstract class Unit {
    int x, y;

    protected String name;
    protected int health;
    protected int velocity;

    public Unit() {
        name = "Stranger";
        health = 100;
        velocity = 4;
        x = 0;
        y = 0;
    }

    public Unit(String name, int health, int velocity) {
        this.name = name;
        this.health = health;
        this.velocity = velocity;
    }


    public abstract void run();

    //Здесь и далее закомментрованный код - для неабстрактного метода
    /*
     public void run() {
        System.out.println("Unit "+name+" breaks to run, his velocity is "+velocity);
    }
     */

    public abstract String getInfo();

    /*
    public String getInfo() {
        return "Unit "+name+" is "+health+"% healthy and can run on "+velocity+"kph";
    }
     */

    void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
