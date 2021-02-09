package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Controller {
}/*
package sample;

        import javafx.application.Application;
        import javafx.application.Platform;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.scene.input.KeyCode;
        import javafx.scene.input.MouseEvent;
        import javafx.scene.layout.Pane;
        import javafx.scene.paint.Color;
        import javafx.scene.shape.Circle;
        import javafx.scene.shape.Rectangle;
        import javafx.scene.text.Text;
        import javafx.stage.Stage;

        import java.util.ArrayList;

public class Main extends Application {
    private boolean starts=false ;

    private Bal extra=null;
    private int first;
    private boolean smart=false;
    private int star;
    private double pi = 3.14159265;
    private int timer =40;
    private boolean fail=false ;
    private int x2;
    private int row=1 ;
    private int health;
    private ArrayList<Brick> module = new ArrayList<Brick>();
    private double score=0;

    private boolean lose = false;
    private static int array;
    private boolean speed = false;

    private Pane pane = new Pane();
    private Text text2;
    private KeyCode lastPressedKey;
    public void  creating(){
        for (int i = 1 ; i <=row+1 ; i++ ){
            for (int j=0 ; j <10 ; j ++){
                int a =(int)(Math.random()*8)+1;
                // System.out.println(j);
                Brick brick3= Brick.switchCase(a,50,20,2*j+j*50,i*2+(i+1)*20);

                if (brick3!=null){
                    module.add(brick3);
                    pane.getChildren().add(brick3);
                }
            }
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
    public void settingStart(boolean starts){
        this.starts=starts;
    }

    public void settingFail(boolean fail){
        this.fail=fail;
    }
    public double starting(Masmasak racket1, Bal bal1){
        double a;
        double degree=45;
        if ( bal1.getCenterX()>=racket1.getX() && bal1.getCenterX()<=racket1.getX()+50){
            a= bal1.getCenterX() - ( racket1.getX() +25) ;
            if (a!=0) {

                degree = 180*Math.atan(25 / a)/pi;
                System.out.println(a+"aaaaa");
                System.out.println(degree+"qwertyuiopasdfghjklzxcvbnm,");
            }
            else {
                degree=90;
            }
        }
        if(degree>0){
            return -degree;
        }
        return 180-degree;


    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        int ali;
        x2=10;
        timer=x2;
        Circle circle= new Circle(100,100,2);
        Bal bal=new Bal(300,560,7);
        Masmasak racket = new Masmasak(50,20,275,560);
        pane.getChildren().add(circle);
        //  pane.getChildren().add(circle1);

        text2 = new Text(500, 500, "score ="+score);

        pane.getChildren().add(text2);

        //  pane.getChildren().add(rectangle);
        //***********
        // pane.getChildren().removeAll();
        pane.getChildren().add(bal);
        pane.getChildren().add(racket);
        Scene scene = new Scene(pane, 600, 600);
        //TODO: this while loop is not going to work. WHY?
        //TODO: create a thread just with lambda expression
        // and put this while loop into it
        //ATTENTION: you need to invoke Platform.runLater. Ask Why.
        new Thread(()->{
            double x=110,y;
            // double x2=circle1.getCenterX(),y2=circle1.getCenterY();
            scene.setOnMouseMoved( m->{
                if(m.getX()<=550) {
                    racket.setX(m.getX());
                }
                circle.setCenterX(racket.getX()+25);
                circle.setCenterY(racket.getY());
            });

            scene.setOnKeyPressed(e -> {
                lastPressedKey=e.getCode();
                if (e.getCode()==KeyCode.K && smart==false  ){

                    /// System.out.println(e);
                    if(bal.getCenterX()-racket.getX()>50 || -bal.getCenterX()+racket.getX()>0){

                        smart=false;
                    }
                    else {
                        smart = true;
                        first=0;
                        score=0;
                        // pane.getChildren().add(circle);
                        if (fail) {
                            System.out.println("you lose...");
                        }
                        creating();
                        bal.setDegree(starting(racket, bal));
                    }
                }/*
                if (e.getCode()==KeyCode.K && smart==false){
                    System.out.println(";;;;;;;;");
                    smart=true;
                }*/
/*
                if (e.getCode()==KeyCode.LEFT){
                    racket.setX(racket.getX() - 15);
                }
                if (e.getCode()==KeyCode.RIGHT){
                    racket.setX(racket.getX() + 15);
                }
                if (e.getCode()==KeyCode.O  ){
                    for(int i=0 ; i<module.size(); i++){
                        if (module.get(i)==null){
                            System.out.println("woow"+i);
                        }
                    }
                }


            });


            while (true) {
                if (fail==true){
                    continue;
                }
                try {

                    if (bal.getCenterX()>=590) {
                        bal.Wall(1);

                    }
                    if ( bal.getCenterX()<=10) {
                        bal.Wall(1);

                        //  System.out.println(bal.getDegree());
                    }
                    if (bal.getCenterY()<=10){
                        bal.Wall(2);

                        //   System.out.println(bal.getDegree());
                    }
                    if(star>0 && bal.getCenterY()>=580){
                        bal.Wall(2);
                    }

                    //    System.out.println("****");

                    Thread.sleep(timer);

                    //TODO: Handle Directions
                    Platform.runLater(() -> {
                                System.out.println(score);
                                if(timer ==3000){
                                    System.out.println("aliiiiii");
                                    if (speed == true ){
                                        timer=x2/2;
                                    }
                                    else{
                                        timer= x2;
                                    }
                                }
                                text2.setText("score ="+score);
                                for (int i = 0 ; i < module.size() ; i ++){

                                    if ( condition( bal, module.get(i)) ){
                                        Brick brik =module.get(i);

                                        bal.setDegree(hitCondition(bal,module.get(i)));
                                        pane.getChildren().remove(module.get(i));
                                        Brick bri= move(bal, i ,brik);

                                        if (bri!=null){
                                            module.add(bri);
                                            pane.getChildren().add(bri);
                                        }
                                        break;

                                    }
                                }
                                if (bal.getCenterY()<= 540){
                                    first=1;
                                }
                                if(extra!=null){
                                    if (extra.getCenterY() + extra.getRadius()>= racket.getY() && ( extra.getCenterX()>=racket.getX() &&
                                            extra.getCenterX()<=racket.getX()+50)  ){
                                        score=score+3;
                                        pane.getChildren().remove(extra);
                                        extra=null;
                                    }
                                    else {
                                        extra.setCenterY(extra.getCenterY()+1);

                                        extra.setCenterX(extra.getCenterX());
                                    }
                                }

                                if (health==1){
                                    bal.increeseHealth();
                                    health=0;
                                }
                                if (bal.getCenterY() + bal.getRadius()>= racket.getY() && ( bal.getCenterX()>=racket.getX() &&
                                        bal.getCenterX()<=racket.getX()+50)  && first!=0 && bal.getDegree()>0 && bal.getDegree()<180  ){
                                    System.out.println("hhhhhhh");
                                    bal.Wall(2);
                                    if(bal.getDegree()%90==0){
                                        System.out.println("aaaaaaaaaaaah");
                                        bal.setDegree(starting(racket, bal));
                                    }
                                }

                                if (star>0){
                                    star--;
                                    bal.setFill(Color.CHARTREUSE);
                                }
                                if(star==0){
                                    bal.setFill(Color.BLUE);
                                }

                                if (loose(bal)){
                                    //tanzim kaf ayne
                                    if(bal.getHealth()<=0){
                                        fail=true;
                                    }
                                    else{
                                        row=1;
                                        bal.decreeseHealth();
                                        //         System.out.println("**"+ bal.getHealth());
                                        //       System.out.println("row");
                                        bal.setCenterX(300);
                                        bal.setCenterY(560);
                                        smart=false;
                                    }
                                }
                                else if (module.size()==0 && smart==true){
                                    changeX();
                                    //   System.out.println("change");
                                    smart=false;
                                }

                                else if (smart==true) {
                                    bal.setCenterX(bal.getCenterX() + Math.cos(pi * bal.getDegree() / 180));

                                    //System.out.println("degree" + bal.getDegree());
                                    //System.out.println("gr" + Math.sin(pi*bal.getDegree()/180));
                                    //   System.out.println("de" + Math.cos(pi*bal.getDegree()/180));
                                    bal.setCenterY(bal.getCenterY() + Math.sin(pi * bal.getDegree() / 180));
                                }
                                //System.out.println("XXXX" + bal.getCenterX());

                                //  System.out.println("YYYY" + bal.getCenterY());
                            }

                    );
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }

        }).start();


        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public  double hitCondition ( Bal bal1 , Rectangle brick1) {
        double m=bal1.getDegree();
        if (bal1.getCenterX() + bal1.getRadius()>= brick1.getX() &&
                bal1.getCenterY()>=brick1.getY() &&
                bal1.getCenterY()<=brick1.getY()+20  &&
                bal1.getCenterX()+bal1.getRadius()<= brick1.getX()+1 )  {

            return 180-m;
        }

        if (bal1.getCenterX() - bal1.getRadius()>= brick1.getX()+49 &&
                bal1.getCenterY()>=brick1.getY() &&
                bal1.getCenterY()<=brick1.getY()+20  &&
                bal1.getCenterX()-bal1.getRadius()<= brick1.getX()+50 ) {

            return 180-m;
        }
        if (bal1.getCenterX() >= brick1.getX() &&
                bal1.getCenterY()+ bal1.getRadius()>=brick1.getY() &&
                bal1.getCenterY()+ bal1.getRadius()<=brick1.getY()+1 &&
                bal1.getCenterX()<= brick1.getX()+50 ) {

            return -m;
        }
        if (bal1.getCenterX() >= brick1.getX() &&
                bal1.getCenterY()- bal1.getRadius()>=brick1.getY()+19 &&
                bal1.getCenterY()-bal1.getRadius()<=brick1.getY()+20  &&
                bal1.getCenterX()<= brick1.getX()+50 ) {

            return -m;
        }
        return m;
    }
    public boolean condition ( Bal bal1 , Brick brick1) {

        if (bal1.getCenterX() + bal1.getRadius()>= brick1.getX() &&
                bal1.getCenterY()+ bal1.getRadius()>=brick1.getY() &&
                bal1.getCenterY()- bal1.getRadius()<=brick1.getY()+20  &&
                bal1.getCenterX()-bal1.getRadius()<= brick1.getX()+50 ) {

            return true;
        }
        return false;
    }
    public Brick move(Bal ball, int i ,Brick brik ){
        Brick bric=module.get(i);
        score =score+bric.getPoint();
        module.remove(i);

        if( bric instanceof SBrick ){
            timer = 3000;
            System.out.println("balck");
            System.out.println(timer);
            return bric.hit(bric);
        }
        if( bric instanceof DBrick ){
            timer = x2;
            speed=false;
            return bric.hit(bric);
        }
        if( bric instanceof ABrick ){
            timer = x2/2;
            speed = true ;
            return bric.hit(bric);
        }
        /**important
         *
         */
  /*      if( bric instanceof STBrick ){
            star = 20000;
            return bric.hit(bric);
        }
        if( bric instanceof CHBrick ){
            extra= new Bal(bric.getX()+25 , bric.getY()+20,3);
            extra.setFill(Color.BLACK);
            pane.getChildren().add(extra);
            return bric.hit(bric);
        }
        if( bric instanceof HBrick ){
            health= 1;
            return bric.hit(bric);
        }
        return bric.hit(bric);


    }
    public boolean loose(Bal bal5) {
        if(bal5.getCenterY()>580 && star<=0 /* conditon of mirror *//* ){
            // mohem*************
          return true;
        }
        return false;
    }

    public void changeX() {
        if (x2>8) {
            x2 = x2 - 4;
        }
        else{

        }
    }
}
//  tanzim timer *******
*/