import java.util.ArrayList;

public class ShoppingBasket {

    private ArrayList<Item> items;

    public ShoppingBasket(){
        this.items = new ArrayList<Item>();
    }

    public int getSize() {
        return this.items.size();
    }

    public void canAddItemToBasket(Item item) {
        this.items.add(item);
    }

    public void canRemoveOneItemFromBasket() {
        this.items.remove(1);
    }

    public void canEmptyBasket() {
        this.items.clear();
    }

    public int getTotal() {
        int total = 0;
        for(Item item : this.items){
            total += item.getCost();
        } return total;
    }

    public int getTotalAfterDiscounts() {
//        int total = getTotal();
//        getDiscount(total);
        for(Item item : this.items){
             total += item.getDiscount(item);
        } return total;
    }
}
