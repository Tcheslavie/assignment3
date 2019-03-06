package ac.za.cput;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Before;

/**
 * Unit test for simple Purchaser.
 */
public class AppTest 
{

    private myObj myobj;
    private myObj myobj2;

    @Before
    public void setup()
    {
        myobj = new myObj("test1", 10);
        myobj2 = new myObj("test1", 10);

    }

    @Test
    public void testObj()
    {
        assertEquals(myobj, myobj2);
        //assertSame(myobj, myobj2);
    }

}
