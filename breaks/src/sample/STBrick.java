package sample;

import javafx.scene.paint.Color;

public class STBrick extends Brick{


    public STBrick(double wide , double high,double x , double y){

        setPoint(1);

        setSpecialWB(0);
        this.setX(x);
        this.setY(y);
        this.setWidth(wide);
        this.setHeight(high);
        this.setFill(Color.SILVER);
    }
    // in page  continue
    @Override
    public Brick hit(Brick module){
        module=null;
        return module;
    }

    @Override
    public String toString() {
        return " DB ";
    }
}

