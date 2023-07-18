public abstract class Cake {

    protected String name;
    protected String baseFlavour;

    public Cake(String name, String baseFlavour){
        this.name = name;
        this.baseFlavour = baseFlavour;
    }

    public abstract String cakeBaked();


}
