package persons;

import java.util.GregorianCalendar;

/**
 * Created by thomas on 30/03/16.
 */
public class TestPeoplePerson extends TestPerson {

    public void setUp(){
        p1 = new PeoplePersonne("toto","tata",1990,10,1);
        d1 = new GregorianCalendar(1995,3,23);
        d2 = new GregorianCalendar(1900,8,1);
        d3 = new GregorianCalendar(1990,10,1);
        d4 = new GregorianCalendar(1992,10,1);

    }
}
