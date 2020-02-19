public class Customer {
    
    String name;
    Boolean loyaltyCard;

    public Customer(String name, Boolean loyaltyCard) {
        this.name = name;
        this.loyaltyCard = loyaltyCard;
    }

    public String getName() {
        return name;
    }

    public Boolean getLoyaltyCard() {
        return loyaltyCard;
    }
}
