package sample;

import javafx.scene.paint.Color;

public final class WBrick extends Brick{
    public WBrick(double wide , double high,double x , double y){
        setPoint(2);
        int a = (int)(Math.random()*2)+2;
        setSpecialWB(a);

        this.setX(x);
        this.setY(y);
        this.setWidth(wide);
        this.setHeight(high);
        this.setFill(Color.BROWN);
    }
    @Override
    public Brick hit(  Brick module){
        int rndom;

        Brick brick = module;
        if (getSpecialWB()<=0){
            int a = (int)(Math.random()*2)+2;
            setSpecialWB(a);
            module=null;

        }
        else {
            changeSpecialWB();
            module= new WBrick(brick.getWidth(), brick.getHeight(),brick.getX(),brick.getY());
            module.setSpecialWB( brick.getSpecialWB() -1);

        }

        return module;

    }

    @Override
    public String toString() {
        return " WB ";
    }
}
