import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket;
    Item item;

    @Before
    public void before() {
        shoppingBasket = new ShoppingBasket();
        item = new Item("banana", 5);
    }

    @Test
    public void basket_starts_empty() {
        assertEquals(0,shoppingBasket.getSize());
    }

    @Test
    public void should_add_item_to_basket() {
        shoppingBasket.canAddItemToBasket(item);
        assertEquals(1, shoppingBasket.getSize());
    }

    @Test
    public void should_remove_one_item_from_basket() {
        shoppingBasket.canAddItemToBasket(item);
        shoppingBasket.canAddItemToBasket(item);
        shoppingBasket.canRemoveOneItemFromBasket();
        assertEquals(1,shoppingBasket.getSize() );
    }

    @Test
    public void should_empty_basket() {
        shoppingBasket.canAddItemToBasket(item);
        shoppingBasket.canAddItemToBasket(item);
        shoppingBasket.canAddItemToBasket(item);
        shoppingBasket.canEmptyBasket();
        assertEquals(0, shoppingBasket.getSize());
    }

    @Test
    public void should_calc_total() {
        shoppingBasket.canAddItemToBasket(item);
        shoppingBasket.canAddItemToBasket(item);
        shoppingBasket.canAddItemToBasket(item);
        assertEquals(15, shoppingBasket.getTotal());
    }

    @Test
    public void should_return_total_after_discounts() {
        shoppingBasket.canAddItemToBasket(item);
        shoppingBasket.canAddItemToBasket(item);
        shoppingBasket.canAddItemToBasket(item);
        assertEquals(15, shoppingBasket.getTotalAfterDiscounts());
    }
}
