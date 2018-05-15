package type;

import tetris.Cell;
import tetris.TetrisOperation;

/**
 * Created by haozt on 2018/4/19.
 */
public class T extends Tetromino{
    public T(){
        this.cells[0] = new Cell(0,4,TetrisOperation.T);
        this.cells[1] = new Cell(0,3,TetrisOperation.T);
        this.cells[2] = new Cell(0,5,TetrisOperation.T);
        this.cells[3] = new Cell(1,4,TetrisOperation.T);
        this.states = new State[4];
        states[0]=new State(0,0,0,-1,0,1,1,0);
        states[1]=new State(0,0,-1,0,1,0,0,-1);
        states[2]=new State(0,0,0,1,0,-1,-1,0);
        states[3]=new State(0,0,1,0,-1,0,0,1);
    }
}
