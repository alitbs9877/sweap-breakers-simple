package sample ;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Masmasak  extends Rectangle {

    public Masmasak(double wide , double high,double x , double y){
        this.setX(x);
        this.setY(y);
        this.setWidth(wide);
        this.setHeight(high);
        this.setFill(Color.RED);
    }
}
