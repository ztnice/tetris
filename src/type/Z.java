package type;

import tetris.Cell;
import tetris.TetrisOperation;

/**
 * Created by haozt on 2018/4/19.
 */
public class Z extends Tetromino {
    public Z(){
        this.cells[0] = new Cell(0,3,TetrisOperation.Z);
        this.cells[1] = new Cell(0,4,TetrisOperation.Z);
        this.cells[2] = new Cell(1,4,TetrisOperation.Z);
        this.cells[3] = new Cell(1,5,TetrisOperation.Z);
        this.states = new State[2];
        states[0] = new State(0,0,-1,-1,-1,0,0,1);
        states[1] = new State(0,0,-1,1,0,1,1,0);
    }
}
