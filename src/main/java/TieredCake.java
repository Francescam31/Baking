import java.util.ArrayList;

public class TieredCake extends Cake{

    private int numberOfTiers;
    private ArrayList<String> tierFlavours;

    public TieredCake(String name, String baseFlavour, int numberOfTiers){
        super(name, baseFlavour);
        this.numberOfTiers = numberOfTiers;
        this.tierFlavours = new ArrayList<>();
    }

    public int getNumberOfTiers(){
        return this.numberOfTiers;
    }

    public ArrayList<String> getTierFlavours(){
        return this.tierFlavours;
    }

    public void setTierFlavours(String flavour){ //sets base tier as baseFlavour and all tiers above the same new flavour
        this.tierFlavours.add(this.baseFlavour);
        for (int i = 0; i < this.numberOfTiers-1; i++) {
            this.tierFlavours.add(flavour);
        }
    }
}
