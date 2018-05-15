package type;

import tetris.Cell;
import tetris.TetrisOperation;

/**
 * Created by haozt on 2018/4/19.
 */
public class S extends Tetromino {
    public S(){
        this.cells[0] = new Cell(0,4,TetrisOperation.S);
        this.cells[1] = new Cell(0,5,TetrisOperation.S);
        this.cells[2] = new Cell(1,4,TetrisOperation.S);
        this.cells[3] = new Cell(1,3,TetrisOperation.S);
        this.states = new State[2];
        this.states[0] = new State(0,0,0,-1,-1,0,-1,1);
        this.states[1] = new State(0,0,-1,0,0,1,1,1);
    }
}
