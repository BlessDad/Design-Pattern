import java.util.ArrayList;
import java.util.List;

public class Box extends Parcell_Item {
    private List <Parcell_Item> items = new ArrayList<>();

    public Box(int weight) {
        super(weight);
    }

    public void addItem(Parcell_Item item){
        items.add(item);
    }

    @Override
    public int price(){
        int total =0;
        for (Parcell_Item p: items){
            total += p.price();
        }
        return total + (super.weight/100 * 10);
    }




}
