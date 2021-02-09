package sample;

import javafx.scene.paint.Color;

public class SBrick extends Brick {
    public SBrick(double wide , double high,double x , double y){
        setPoint(1);
        //int a = (int)(Math.random()*2)+2;
        setSpecialWB(0);

        this.setX(x);
        this.setY(y);
        this.setWidth(wide);
        this.setHeight(high);
        this.setFill(Color.GREENYELLOW);
    }
    // in page  continue
    @Override
    public Brick hit(  Brick module){
      /*  int rndom;
        if (getSpecialWB()==0){
            int a = (int)(Math.random()*2)+2;
            setSpecialWB(a);
            rndom= 0;
        }
        else {
            changeSpecialWB();
            rndom= 4;
        }

        Module mode= module[numOfModule];

        if(module[numOfModule].getSpecialWB()==0){
            System.out.println();
            module[numOfModule]=switchCase(0);
            module[numOfModule-1]= new Ball(0);
        }
        else{

        }*/
        return null;
    }

    @Override
    public String toString() {
        return " SB ";
    }
}
