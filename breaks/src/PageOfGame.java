package sample;
import  java.util.Scanner;

/**
 * @author alitbs
 */
public class PageOfGame {
/*
    private static  Module module[];
    static boolean lose = false;
    private static int array;
    static boolean speed = false;
    private PageOfGame(){

    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" how many stage do you want that continue this game ?");
        int counter = scanner.nextInt();
        System.out.println(" how many part do you want that array has ?");
        array = scanner.nextInt();
        module=new Module[array];
        module[0] = new Ball(1);
        for (int i = 1; i < array-1; i++) {
            module[i] = new EmptyModule();

        }
        int a = (int) (Math.random() * 6) + 1;
        module[array-1] = switchCase(a);
        int i = 0;
        while (lose || counter>=i) {
            if (!(module[array-1] instanceof Brick)) {
                break;
            }
            if (counter < i) {
                      break;
            }
            if (lose == true) {
                         break;
            }
            show();
            moveBall();
            if (speed) {
                moveBall();
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println("ali");
            }
            i++;
        }

    }

    public static void show() {
        for (int i = 0; i < array; i++) {
            System.out.print(module[i]);
        }

        System.out.println(" ");
    }

    public static void moveBall() {
        for (int i = 0; i < array-1; i++) {
            if (module[i] instanceof Ball) {
                if (module[i].getType() == 1) {

                    if (module[i + 1] instanceof ABrick) {
                        speed = true;
                    }

                    if (module[i + 1] instanceof DBrick) {
                        speed = false;
                    }
                    module = module[i + 1].hit(i + 1, module, array);
                    lose=checkLost();



                }

                 if ( module[i].getType() == 0 && module[i] instanceof Ball ) {
                     if( module[i-1] instanceof EmptyModule){
                         if (i-1>0) {
                             Module mod = module[i - 1];

                             module[i - 1] = module[i];
                             module[i] = mod;
                         }
                         if (i-1==0){

                             Module mod = module[i - 1];

                             module[i - 1] = new Ball(1);
                             module[i] = mod;

                             System.out.println(" ");
                             System.out.println("***********");
                             System.out.println(" ");
                         }
                     }


                }
                break;
            }



        }
    }
    public static boolean checkLost(){
        if (module[0] instanceof Ball && module[1]instanceof Brick ){
            return true;
        }
        return false;
    }

    public static Module switchCase(int num){
        Module module1;
        switch (num) {
            case 0:
                module1 = new EmptyModule();
                break;
            case 1:
                module1 = new LBrick();
                break;
            case 2:

                module1 = new WBrick();
                break;
            case 3:

                module1 = new MBrick();
                break;
            case 4:

                module1 = new SBrick();
                break;
            case 5:

                module1 = new ABrick();
                break;
            case 6:

                module1 = new DBrick();
                break;

            default:

                module1 = new EmptyModule();
                System.out.println(" ;) ");
        }
        return module1;


    }*/
}

