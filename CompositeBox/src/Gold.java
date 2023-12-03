public class Gold extends Parcell_Item{

    public Gold(int weight){
        super(weight);
    }
    public int price(){
        return super.weight/100 * 20000;
        // 100g 당 200원
    }
}
