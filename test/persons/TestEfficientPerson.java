package persons;

import org.junit.Before;
import people.EfficientPerson;

import java.util.GregorianCalendar;

/**
 * Created by thomas on 30/03/16.
 */
public class TestEfficientPerson extends TestPerson{



    @Before
    public void setUp(){
        p1 = new EfficientPerson("toto","tata",4);
        d1 = new GregorianCalendar(1995,3,23);
        d2 = new GregorianCalendar(1900,8,1);
        d3 = new GregorianCalendar(1990,10,1);
        d4 = new GregorianCalendar(1992,10,1);

    }
}
