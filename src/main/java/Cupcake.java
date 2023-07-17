public class Cupcake extends Cake{

    private int quantity;

    public Cupcake(String name, String baseFlavour, int quantity){
        super(name, baseFlavour);
        this.quantity = quantity;
    }

    public boolean enoughIcing(){
        return this.quantity < 12;
    }

}
