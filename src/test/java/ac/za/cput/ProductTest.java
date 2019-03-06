package ac.za.cput;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {
    private Product prod;
    @Before
    public void setUp() throws Exception {
        prod=new Product("Tomato", 5);
    }

    @Test
    public void getPrice() {
        assertEquals(5, prod.getPrice());
    }
}