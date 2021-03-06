package type;

import tetris.Cell;
import tetris.TetrisOperation;

/**
 * Created by haozt on 2018/4/19.
 */
public class I  extends Tetromino{
    public I(){
        cells[0] = new Cell(0,3,TetrisOperation.I);
        cells[1] = new Cell(0,4,TetrisOperation.I);
        cells[2] = new Cell(0,5,TetrisOperation.I);
        cells[3] = new Cell(0,6,TetrisOperation.I);
        states = new State[2];
        states[0] = new State(0,0,0,-1,0,1,0,2);
        states[1] = new State(0,0,-1,0,1,0,2,0);
    }

}
