public class Traybake extends Cake{

    private int sizeOfTray; // 1 side in cm

    public Traybake(String name, String baseFlavour, int sizeOfTray){
        super(name, baseFlavour);
        this.sizeOfTray = sizeOfTray;
    }

    public String cakeBaked(){
        return "Traybake is ready";
    }

    public int calculateBakingTime(){

        return 2*this.sizeOfTray; // minutes
    }
}
