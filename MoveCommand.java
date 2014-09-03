package sokolchik.paul.units;

/**
 * Created by sokolchik_p on 03.09.2014.
 */
public class MoveCommand implements Command {
    private Unit unit;
    private int x,y;
    private int prevX;
    private int prevY;


    public MoveCommand (Unit unit, int x, int y){
        this.unit = unit;
        this.x=x;
        this.y=y;
    }

    @Override
    public void execute() {
        prevX = unit.x;
        prevY=unit.y;
        unit.moveTo(x,y);
    }

    @Override
    public void undo() {
        unit.moveTo(prevX,prevY);

    }
}
