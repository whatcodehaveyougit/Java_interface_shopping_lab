import java.util.ArrayList;

public class PercentageDiscount implements Discounting {

    public void getTotalAfterDiscounts(ArrayList<Item> items, double total) {
        if (total > 10) {
            return total * 0.8;
        }
    }

}

