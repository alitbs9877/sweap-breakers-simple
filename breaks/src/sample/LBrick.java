package sample;

import javafx.scene.paint.Color;

public class LBrick extends Brick {

    public LBrick(double wide , double high,double x , double y){
        setPoint(1);
        setSpecialWB(0);
        this.setX(x);
        this.setY(y);
        this.setWidth(wide);
        this.setHeight(high);
        this.setFill(Color.GOLD);
    }
    @Override
    public Brick hit(  Brick module){
        int newBrick ;
        Brick brick = module;
        newBrick = (int)(Math.random()*8)+1;
        return switchCase(newBrick , brick.getWidth(), brick.getHeight(),brick.getX(),brick.getY());
      //  module[numOfModule-1]=new Ball(0);


    }

    @Override
    public String toString() {
        return " LB ";
    }
}
