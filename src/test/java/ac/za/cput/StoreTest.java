package ac.za.cput;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StoreTest {
    private Store store;
    @Before
    public void setUp() throws Exception {
        store = new Store();
    }

    @Test
    public void sellProduct() {
        store.sellProduct();
        store.sellProduct();

        assertEquals(3, store.getStock());
    }
}