public class Traybake extends Cake{

    private int sizeOfTray; // 1 side in cm

    public Traybake(String name, String baseFlavour, int bakingTime, int sizeOfTray){
        super(name, baseFlavour, bakingTime);
        this.sizeOfTray = sizeOfTray;
    }

    public int calculateBakingTime(){
        return 2*sizeOfTray; // minutes
    }
}
