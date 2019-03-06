package ac.za.cput;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static java.lang.Thread.sleep;
import static org.junit.Assert.*;

public class myObjTest {

    private myObj obj1;
    private myObj obj2;
    private myObj obj3;
    private myObj obj4;
    @Before
    public void setUp() throws Exception {
        obj1 = new myObj("Test 1", 1);
        obj2 = new myObj("Test 1", 1);
        obj3 = new myObj("Test 2", 2);
        obj4 = new myObj("Test 3", 3);
    }

    @Test
    public void testEquality()
    {
        assertEquals(obj1, obj2); // Equal
    }

    @Test
    public void testEquality2()
    {
        assertNotEquals(obj1, obj3); // Not equal
    }

    @Test
    public void testIdentity()
    {
        assertSame(obj1, obj1);
    }

    @Test
    public void testIdentity2()
    {
        assertNotSame(obj1, obj2);
    }

    @Test
    public void testFail()
    {
        fail();
    }

    @Test(timeout = 500)
    public void testTimeout() // Failing a test because the execution time exceeds the timeout
    {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
        }
    }

    @Ignore ("This test must be ignored")
    @Test
    public void testIgnored()
    {
        assertEquals(obj1, obj4);
    }

}