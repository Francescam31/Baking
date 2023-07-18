public class Cupcake extends Cake implements IIce{

    private int quantity;

    public Cupcake(String name, String baseFlavour, int quantity){
        super(name, baseFlavour);
        this.quantity = quantity;
    }

    public boolean enoughIcing(){ // hypothetically there is only enough icing for 11 cakes
        return this.quantity < 12;
    }

    public boolean enoughIcing(String icingFlavour){
        if (icingFlavour == "Chocolate"){
            return true;
        } else if (icingFlavour == "Vanilla") {
            return false;
        }else{
            return false;
        }
    }

    public String cakeBaked(){
        return "Cupcakes are ready";
    }

    public String ice(){
        return "Cupcakes are iced and ready to go";
    }

}
