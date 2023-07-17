import java.util.ArrayList;

public class Bakery {

    private String name;
    private ArrayList<Cake> cakes;

    public Bakery(String name){
        this.name = name;
        cakes = new ArrayList<>();
    }

    public int countCakes(){
        return cakes.size();
    }

    public void addCake(Cake cake){
        this.cakes.add(cake);
    }

}
