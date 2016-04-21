package persons;
import org.junit.*;
import org.mockito.Mockito;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.*;
/**
 * Created by thomas on 17/04/16.
 */
public class TestOutilsPerson {

    protected OutilsPerson outilsPerson;
    protected ArrayList<IPerson> persons;
    protected GregorianCalendar gregorianCalendar;

    public TestOutilsPerson(){

    }


    @BeforeClass
    public static void setUpClass(){

    }

    @AfterClass
    public static void tearDownClass(){

    }

    @Before
    public void setUp(){
        outilsPerson = new OutilsPerson();
        persons = new ArrayList<>();
        gregorianCalendar = new GregorianCalendar(1995,GregorianCalendar.MARCH,23);

        IPerson p1 = mock(IPerson.class);
        IPerson p2 = mock(IPerson.class);
        IPerson p3 = mock(IPerson.class);
        IPerson p4 = mock(IPerson.class);

        Mockito.when(p1.getAge(Mockito.any())).thenReturn(25);
        Mockito.when(p2.getAge(Mockito.any())).thenReturn(2);
        Mockito.when(p3.getAge(Mockito.any())).thenReturn(52);
        Mockito.when(p4.getAge(Mockito.any())).thenReturn(101);

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

    }

    @After
    public void tearDown(){

    }

    @Test
    public void methodeQ5(){
        assertSame("should be same",outilsPerson.methodeQ5(persons,gregorianCalendar,20,60),2);

    }

    @Test(expected = IllegalArgumentException.class)
    public void methodeQ5Exception(){
        outilsPerson.methodeQ5(persons,gregorianCalendar,40,20);
    }

    @Test
    public void methodeQ6(){
        assertSame("should be same",outilsPerson.methodeQ6(persons,gregorianCalendar),101);
    }


    @Test
    public void methodeQ6Question9(){
        assertSame("should be same",outilsPerson.methodeQ6(persons,gregorianCalendar),101);

        for(IPerson p : persons){
            verify(p,never()).getFirstName();
            verify(p,never()).getName();
            verify(p,atLeastOnce()).getAge(gregorianCalendar);
        }
    }
}
