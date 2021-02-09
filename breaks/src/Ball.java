package sample;
public class Ball extends Module {

    public Ball(int a ){
        setType(a);


    }

    @Override
    public Module[] hit(int numOfModule,  Module module[], int numOfArray) {

        return module;
    }

    @Override
    public String toString() {
        if (getType()==1){
            return " O> ";
        }
        else {
            return " <O ";
        }
    }
}
