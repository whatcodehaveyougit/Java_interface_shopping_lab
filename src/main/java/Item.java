import java.util.ArrayList;

public class Item {

    private String name;
    private int cost;
    private ArrayList <Discounting> discounts;

    public Item(String name, int cost) {
        this.name = name;
        this.cost = cost;
        this.discounts = new ArrayList<Discounting>();
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

//    public void getDiscount() {
//        this.discounts.get(0).getDiscount();
//    }

}
