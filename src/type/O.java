package type;

import tetris.Cell;
import tetris.TetrisOperation;

/**
 * Created by haozt on 2018/4/19.
 */
public class O extends Tetromino {
    public O(){
        this.cells[0] = new Cell(0,4,TetrisOperation.O);
        this.cells[1] = new Cell(0,5,TetrisOperation.O);
        this.cells[2] = new Cell(1,4,TetrisOperation.O);
        this.cells[3] = new Cell(1,5,TetrisOperation.O);
        this.states = new State[1];
        states[0] = new State(0,0,0,1,1,0,1,1);
    }
}
