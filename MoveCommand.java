package sokolchik.paul.units;


import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by sokolchik_p on 03.09.2014.
 */
public class MoveCommand implements Command {
    private Unit unit;
    private Position newPosition;
    //private static Deque<Position> historyD = new LinkedList<Position>();
    private static Stack<Position> history = new Stack<Position>();


    public MoveCommand (Unit unit, Position newPosition){
        this.unit = unit;
        this.newPosition = newPosition;
    }

    @Override
    public void execute() {
        history.push(unit.currentPos);
        //historyD.push(unit.currentPos);
        unit.moveTo(newPosition);
    }

    @Override
    public void undo() {
        unit.moveTo(history.pop());
        //unit.moveTo(historyD.pop());
    }
}
