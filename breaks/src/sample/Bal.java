package sample ;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Bal extends Circle {
    private int health = 3 ;
    private  double degree =45  ;

    public void setDegree( double degree ){
        this.degree=degree;
    }

    public double getDegree() {
        return degree;
    }

    public Bal(double x , double y , double r ){
        this.setCenterX(x);
        this.setCenterY(y);
        this.setRadius(r);
        this.setFill(Color.BLUE);
    }
    public void decreeseHealth(){
        health--;
    }

    public int getHealth() {
        return health;
    }

    public void increeseHealth(){
        health++;
    }
    public boolean fail(){
        if (health<=0) return true;
        return false;
    }
    public void Wall( int numOfWall){
        // *********check the relation between degree and wall**********
        double result=degree ;
        switch (numOfWall){
            case 1:
                //left
                result =180 -degree;
                break;
            case 2:
                //up
                result =  -degree;

                break;
            case 3:
                //right
                result = 180-degree;

                break;
            case 4 :
                //down
                result = -degree;

                break;

        }
        degree=result;
    }

}
