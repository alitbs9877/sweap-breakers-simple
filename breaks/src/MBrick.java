package sample;
public class MBrick extends Brick {
   /* public MBrick(){
        setPoint(2);

        setSpecialWB(0);
    }
    @Override
    public Module[] hit(int numOfModule,  Module module[], int numOfArray){
        int newBrick ;
        newBrick = (int)(Math.random()*6)+1;

        for (int j=numOfModule-1; j <numOfArray; j++){
            module[j]= switchCase(newBrick);
            newBrick= (int)(Math.random()*6 )+1;

        }

        module[numOfModule-2]= new Ball(0);
        return module;

    }

    @Override
    public String toString() {
        return " MB ";
    }*/

    @Override
    public Brick hit(Brick module){
        return module;

    }
}
