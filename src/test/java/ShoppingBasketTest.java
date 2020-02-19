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
    public void should_add_item_to_basket() {
        shoppingBasket.canAddItemToBasket(item);
        assertEquals(1, shoppingBasket.getSize());
    }
}
