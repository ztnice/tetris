package type;

import tetris.Cell;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by haozt on 2018/4/19.
 * 4�񷽿�
 * ÿһ�����鶼����4�����ӹ���
 */
public abstract class Tetromino {
    //ÿ��������4���������
    protected Cell[] cells =new Cell[4];
    //��ת״̬����
    protected State[] states;
    //��ת״̬�������
    protected int index = 10000;

    /**
     * �������7�ַ���֮һ
     * @return
     */
    public static Tetromino randOne(){
        Random random = new Random();
        int type = random.nextInt(7);
        switch (type){
            case 0:return new Z();
            case 1:return new I();
            case 2:return new J();
            case 3:return new L();
            case 4:return new O();
            case 5:return new T();
            case 6:return new S();
        }
        return null;
    }

    public String toString(){
        return Arrays.toString(this.cells);
    }

    public void softDrop(){
        this.cells[0].drop();
        this.cells[1].drop();
        this.cells[2].drop();
        this.cells[3].drop();
    }
    public void moveLeft(){
//        this.cells[0].moveLeft();
//        this.cells[1].moveLeft();
//        this.cells[2].moveLeft();
//        this.cells[3].moveLeft();
        for(int i=0;i<cells.length;i++){
            this.cells[i].moveLeft();
        }
    }
    public void moveRight(){
        this.cells[0].moveRight();
        this.cells[1].moveRight();
        this.cells[2].moveRight();
        this.cells[3].moveRight();
    }

    /**
     * ������ת�ķ���
     */
    public void rotateRight(){
        //S0-S1-S2-S3-S0-S1...
        index++;
        State s = this.states[index%this.states.length];
        //��cells[0]Ϊ�������ת
        Cell cell = this.cells[0];
        int row = cell.getRow();
        int col = cell.getCol();
        this.cells[1].setRow(s.getRow1()+row);
        this.cells[1].setCol(s.getCol1()+col);
        this.cells[2].setRow(s.getRow2()+row);
        this.cells[2].setCol(s.getCol2()+col);
        this.cells[3].setRow(s.getRow3()+row);
        this.cells[3].setCol(s.getCol3()+col);
    }

    public void rotateLeft(){
        //S3-S2-S1-S0-S3...
        index--;
        State state = this.states[this.index%this.states.length];
        Cell cell = cells[0];
        int row = cell.getRow();
        int col = cell.getCol();
        this.cells[1].setRow(state.getRow1()+row);
        this.cells[1].setCol(state.getCol1()+col);
        this.cells[2].setRow(state.getRow2()+row);
        this.cells[2].setCol(state.getCol2()+col);
        this.cells[3].setRow(state.getRow3()+row);
        this.cells[3].setCol(state.getCol3()+col);
    }

}
