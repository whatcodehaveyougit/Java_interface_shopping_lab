import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ItemTest {

    private Item item;

    @Before
    public void before() {
        item = new Item("apple", 10);
    }

    @Test
    public void item_has_name() {
        assertEquals("apple", item.getName());
    }

    @Test
    public void item_has_cost() {
        assertEquals(10, item.getCost());
    }
}
