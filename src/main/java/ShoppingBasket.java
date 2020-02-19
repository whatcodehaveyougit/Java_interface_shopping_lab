import java.util.ArrayList;

public class ShoppingBasket {

    private ArrayList<Item> items;

    public ShoppingBasket(){
        this.items = new ArrayList<Item>();
    }

    public void canAddItemToBasket(Item item) {
        this.items.add(item);
    }


    public int getSize() {
        return this.items.size();
    }
}
