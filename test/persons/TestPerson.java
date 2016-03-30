package persons;

import org.junit.*;

import java.util.GregorianCalendar;

import static org.junit.Assert.*;

/**
 * Created by thomas on 30/03/16.
 */
public class TestPerson {

    private Person p1;
    private Person p2;
    private GregorianCalendar d1;
    private GregorianCalendar d2;
    private GregorianCalendar d3;

    @BeforeClass
    public static void setUpClass(){

    }

    @AfterClass
    public static void tearDownClass(){

    }

    @Before
    public void setUp(){
        p1 = new Person("toto","tata",1990,10,1);
        p2 = new Person("titi","tutu",1806,6,6);
        d1 = new GregorianCalendar(1995,3,23);
        d2 = new GregorianCalendar(1900,8,1);
        d3 = new GregorianCalendar(1789,7,14);

    }

    @After
    public void tearDown(){

    }

    @Test (expected = java.lang.IllegalArgumentException.class)
    public void testGetAgeException(){
        p1.getAge(d2);

    }

    @Test
    public void testGetAge(){
        assertSame("should be same",p1.getAge(d1),4);
        assertSame("should be same too",p2.getAge(d2),94);
    }

    @Test
    public void testWasBornFalse(){
        assertFalse("should be false",p1.wasBorn(d2));
        assertFalse("should be false too",p2.wasBorn(d3));
    }

    @Test
    public void testWasBornTrue(){
        assertTrue("should be true",p1.wasBorn(d1));
        assertTrue("shuld be same too",p2.wasBorn(d2));
    }





}
