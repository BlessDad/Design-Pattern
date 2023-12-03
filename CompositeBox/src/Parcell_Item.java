public abstract class Parcell_Item {
    protected int weight;
    public Parcell_Item(int weight){
        this.weight = weight;
    }

    public abstract int price();
}
