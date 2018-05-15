package tetris;

import java.awt.image.BufferedImage;

/**
 * Created by haozt on 2018/4/19.
 * 俄罗斯方块 格子类
 */
public class Cell {
    private int row;
    private int col;
    private BufferedImage bufferedImage;

    public Cell(int row,int col,BufferedImage bufferedImage){
        this.row=row;
        this.col=col;
        this.bufferedImage=bufferedImage;
    }
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }

    public void setBufferedImage(BufferedImage bufferedImage) {
        this.bufferedImage = bufferedImage;
    }

    public void moveLeft(){
        col--;
    }
    public void moveRight(){
        col++;
    }
    public void drop(){
        row++;
    }
    public String toString(){
        return "row="+row+",col="+col;
    }
}
