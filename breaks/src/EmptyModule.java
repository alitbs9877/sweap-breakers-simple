package sample;
public class EmptyModule extends Module {
    public EmptyModule(){

    }

    @Override
    public Module[] hit(int numOfModule,  Module module[], int numOfArray) {

      //  if(module[numOfModule-1] instanceof Ball && module[numOfModule-1].getType()==1 && numOfModule>=1) {

        Module mod = module[numOfModule - 1];

        module[numOfModule - 1] = module[numOfModule];
        module[numOfModule] = mod;
      /*  }
        else if (module[numOfModule+1] instanceof Ball && module[numOfModule-1].getType()==0 ){

            if (numOfModule>0) {
                Module mod = module[numOfModule];

                module[numOfModule] = module[numOfModule+1];
                module[numOfModule+1] = mod;
            }
            if (numOfModule==0){

                Module mod = module[numOfModule];

                module[numOfModule] = new Ball(1);
                module[numOfModule+1] = mod;
                System.out.println(" ");
                System.out.println("***********");
                System.out.println(" ");
            }

            System.out.println("doroste22");

        }*/
        return module;
    }

    @Override
    public String toString() {
        return " ## ";
    }
}
