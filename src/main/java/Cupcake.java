public class Cupcake extends Cake implements IIce{

    private int quantity;

    public Cupcake(String name, String baseFlavour, int quantity){
        super(name, baseFlavour);
        this.quantity = quantity;
    }

    public boolean enoughIcing(){ // hypothetically there is only enough icing to ice 11 cakes
        return this.quantity < 12;
    }

    public String cakeBaked(){
        return "Cupcakes are ready";
    }

    public String ice(){
        return "Cake is iced and ready to go";
    }

}
