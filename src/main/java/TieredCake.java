import java.util.ArrayList;

public class TieredCake extends Cake{

    private int numberOfTiers;
    private ArrayList<String> tierFlavours;

    public TieredCake(String name, String baseFlavour, int bakingTime, int numberOfTiers){
        super(name, baseFlavour);
        this.numberOfTiers = numberOfTiers;
        this.tierFlavours = new ArrayList<>();
    }

    public void setTierFlavours(){

    }
}
