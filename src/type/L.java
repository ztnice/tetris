package type;

import tetris.Cell;
import tetris.TetrisOperation;

/**
 * Created by haozt on 2018/4/19.
 */
public class L extends Tetromino {
    public L(){
        this.cells[0] = new Cell(0,4,TetrisOperation.L);
        this.cells[1] = new Cell(0,3,TetrisOperation.L);
        this.cells[2] = new Cell(0,5,TetrisOperation.L);
        this.cells[3] = new Cell(1,3,TetrisOperation.L);
        this.states = new State[4];
        states[0] = new State(0,0,0,1,0,-1,-1,1);
        states[1] = new State(0,0,1,0,-1,0,1,1);
        states[2] = new State(0,0,0,-1,0,1,1,-1);
        states[3] = new State(0,0,-1,0,1,0,-1,-1);
    }
}
