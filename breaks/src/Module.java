package sample;
public abstract class Module  {
    private double point;
    private int specialWB;
    private int type;


    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }


    public double getPoint() {
        return point;
    }
    public void setPoint(double point){
        this.point=point;
    }
    public abstract Module[] hit(int numOfModule, Module module[],int numOfArray);
    public int getSpecialWB() {
        return specialWB;
    }
    public void changeSpecialWB(){
        specialWB--;
    }
    public void setSpecialWB(int specialWB) {
        this.specialWB = specialWB;
    }
/*
    public static  Module switchCase(int num){
        Module module1;
        switch (num ){
            case 0:
                module1= new EmptyModule();
                break;
            case 1:
                module1= new LBrick();
                break;
            case 2:

                module1= new WBrick();
                break;
            case 3:

                module1= new MBrick();
                break;
            case 4:

                module1= new SBrick();
                break;
            case 5:

                module1= new ABrick();
                break;
            case 6:

                module1= new DBrick();
                break;

            default:

                module1= new EmptyModule();
                System.out.println(" ;) ");
        }
        return module1;


    }*/

}
