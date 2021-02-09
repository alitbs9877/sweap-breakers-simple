package sample;

import javafx.scene.shape.Rectangle;

public abstract class Brick extends Rectangle {
    private double point;
    private int specialWB;
    private int type;


    public int getType() {
        return type;
    }

    public final void setType(int type) {
        this.type = type;
    }


    public double getPoint() {
        return point;
    }
    public void setPoint(double point){
        this.point=point;
    }
    public int getSpecialWB() {
        return specialWB;
    }
    public void changeSpecialWB(){
        specialWB--;
    }
    public void setSpecialWB(int specialWB) {
        this.specialWB = specialWB;
    }

    public static  Brick switchCase(int num, double wide , double high,double x , double y){
        Brick module1 = null;
        switch (num ){
            case 0:
                module1=null;
                break;
            case 1:
                module1= new LBrick( wide ,  high, x ,  y);
                break;
            case 2:

                module1= new WBrick( wide ,  high, x ,  y);
                break;

            case 3:

                module1= new SBrick( wide ,  high, x ,  y);
                break;
            case 4:

                module1= new ABrick( wide ,  high, x ,  y);
                break;
            case 5:

                module1= new DBrick( wide ,  high, x ,  y);
                break;
            case 6:

                module1= new HBrick( wide ,  high, x ,  y);
                break;
            case 7:

                module1= new STBrick( wide ,  high, x ,  y);
                break;
            case 8:

                module1= new CHBrick( wide ,  high, x ,  y);
                break;

            default:

             //   module1= new EmptyModule();
                System.out.println(" ;) ");
        }
        return module1;


    }

    public Brick(){


    }

    public abstract Brick hit(Brick module);
}
