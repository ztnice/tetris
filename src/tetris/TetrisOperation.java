package tetris;

import type.Tetromino;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;

/**
 * Created by IntelliJ IDEA.
 * User: haozt
 * Date: 2018/5/14
 * Time: 12:45
 * To change this template use File | Settings | File Templates.
 */
public class TetrisOperation extends JPanel{
    private int state;//游戏状态
    public  static final int RUNNING = 0;
    public  static final int PAUSE = 1;
    public static final int GAME_OVER = 2;

    private int score;
    private int lines;
    private int level;
    private long index =0;
    private int speed = 40;

    public static final int ROWS = 20;
    public static final int COLS = 15;

    private Cell[][] wall = new Cell[ROWS][COLS];//格子墙

    private Tetromino currentCell;//当前格子
    private Tetromino nextCell;//下一个出场的格子

    public static BufferedImage background;
    public static BufferedImage I;
    public static BufferedImage J;
    public static BufferedImage O;
    public static BufferedImage S;
    public static BufferedImage T;
    public static BufferedImage Z;
    public static BufferedImage L;
    public static BufferedImage pause;
    public static BufferedImage gameOver;

    static{
       try{
           I = ImageIO.read(TetrisOperation.class.getResource("/image/I.png"));
           J = ImageIO.read(TetrisOperation.class.getResource("/image/J.png"));
           L = ImageIO.read(TetrisOperation.class.getResource("/image/L.png"));
           O = ImageIO.read(TetrisOperation.class.getResource("/image/O.png"));
           S = ImageIO.read(TetrisOperation.class.getResource("/image/S.png"));
           T = ImageIO.read(TetrisOperation.class.getResource("/image/T.png"));
           Z = ImageIO.read(TetrisOperation.class.getResource("/image/Z.png"));
           gameOver = ImageIO.read(TetrisOperation.class.getResource("/image/game-over.png"));
           pause = ImageIO.read(TetrisOperation.class.getResource("/image/pause.png"));
           background = ImageIO.read(TetrisOperation.class.getResource("/image/tetris.png"));
       }catch (Exception e){
           e.printStackTrace();
       }
    }


    public void action(){

    }

    public static void  main(String[] args){
        System.out.println(111);
    }
}
