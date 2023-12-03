import java.util.ArrayList;
import java.util.List;

public class CartForSongs {
    List<Song> cart = new ArrayList<>();
    public double calculateTotalPrice() {
        double total = 0.0;
        for (Song s : cart) {
            if (s.getDiscountMode().equals("OnSale"))
                total = total + (s.getPrice() - 0.1 * s.getPrice());
            else if (s.getDiscountMode().equals("TodayEvent"))
                total = total + (s.getPrice() - 0.3 * s.getPrice());
            else total = total + s.getPrice();
        }
        return total;
    }
    public void add(Song s) { cart.add(s); }
}