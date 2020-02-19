public abstract class Discount implements Discounting {

    int price;

    public Discount() {
        this.price = price;
    }

    public int getDiscount(double total){
        if (total > 20) {
            return total * 0.8;
        }
    }

}
