package ac.za.cput;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    private Customer cust;

    @Before
    public void setUp() throws Exception {
        cust = new Customer("John", 10);
    }

    @Test
    public void getBalance() {
        assertEquals(10, cust.getBalance());
    }

    @Test
    public void reduceBalance() { cust.reduceBalance(7); assertEquals(3, cust.getBalance());}
}