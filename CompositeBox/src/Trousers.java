public class Trousers extends Parcell_Item{
    public Trousers(int weight){
        super(weight);
    }
    @Override
    public int price(){
        return super.weight/100 * 200;
        // 100g 당 200원
    }
}
