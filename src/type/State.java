package type;

/**
 * Created by IntelliJ IDEA.
 * User: haozt
 * Date: 2018/5/11
 * Time: 13:30
 * To change this template use File | Settings | File Templates.
 * 格子坐标所对应的状态 旋转状态
 */
public class State {
    private int row1;
    private int col1;
    private int row2;
    private int col2;
    private int row3;
    private int col3;
    private int row4;
    private int col4;

    public State(int row1, int col1, int row2, int col2, int row3, int col3, int row4, int col4) {
        this.row1 = row1;
        this.col1 = col1;
        this.row2 = row2;
        this.col2 = col2;
        this.row3 = row3;
        this.col3 = col3;
        this.row4 = row4;
        this.col4 = col4;
    }

    public int getRow1() {
        return row1;
    }

    public void setRow1(int row1) {
        this.row1 = row1;
    }

    public int getCol1() {
        return col1;
    }

    public void setCol1(int col1) {
        this.col1 = col1;
    }

    public int getRow2() {
        return row2;
    }

    public void setRow2(int row2) {
        this.row2 = row2;
    }

    public int getCol2() {
        return col2;
    }

    public void setCol2(int col2) {
        this.col2 = col2;
    }

    public int getRow3() {
        return row3;
    }

    public void setRow3(int row3) {
        this.row3 = row3;
    }

    public int getCol3() {
        return col3;
    }

    public void setCol3(int col3) {
        this.col3 = col3;
    }

    public int getRow4() {
        return row4;
    }

    public void setRow4(int row4) {
        this.row4 = row4;
    }

    public int getCol4() {
        return col4;
    }

    public void setCol4(int col4) {
        this.col4 = col4;
    }
}
