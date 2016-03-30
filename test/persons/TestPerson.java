package persons;

import org.junit.*;

import java.util.GregorianCalendar;

import static org.junit.Assert.*;

/**
 * Created by thomas on 30/03/16.
 */
public class TestPerson {

    /*
    Deux Classes d'équivalences pour wasBorn :
        - La date passé en paramètre est postérieure à la date de naissance -> True
        - La date passé en paramètre est antérieure à la date de naissance -> False

    Deux Classes d'équivalences pour getAge :
        - La date passé en paramètre est postérieure à la date de naissance -> retourne l'age
        - La date passé en paramètre est antérieure à la date de naissance -> exception java.lang.IllegalArgumentException levée

     */

    protected IPerson p1;
    protected GregorianCalendar d1;
    protected GregorianCalendar d2;
    protected GregorianCalendar d3;
    protected  GregorianCalendar d4;


    @BeforeClass
    public static void setUpClass(){

    }

    @AfterClass
    public static void tearDownClass(){

    }

    @Before
    public void setUp(){


        p1 = new Person("toto","tata",1990,10,1);
        d1 = new GregorianCalendar(1995,3,23);
        d2 = new GregorianCalendar(1900,8,1);
        d3 = new GregorianCalendar(1990,10,1);
        d4 = new GregorianCalendar(1992,10,1);

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
    }

    @Test
    public void testGetAgeZero(){
        assertSame("should be same",p1.getAge(d3),0);
    }

    @Test
    public void testGetAgeDeuxAns(){
        assertSame("should be same",p1.getAge(d4),2);
    }

    @Test
    public void testGetAgeBeforeBirthdate(){
        assertSame("should be same",p1.getAge(new GregorianCalendar(1992,9,2)),1);
    }

    @Test
    public void testGetAgeAfterBirthdate(){
        assertSame("should be same",p1.getAge(new GregorianCalendar(1992,10,2)),2);
    }

    @Test
    public void testWasBornFalse(){
        assertFalse("should be false",p1.wasBorn(d2));
    }

    @Test
    public void testWasBornEquals(){
        assertTrue("should be true",p1.wasBorn(d3));

    }

    @Test
    public void testWasBornTrue(){
        assertTrue("should be true",p1.wasBorn(d1));
    }





}
