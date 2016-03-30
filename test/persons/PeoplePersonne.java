package persons;

import people.Personne;

import java.util.GregorianCalendar;

/**
 * Created by thomas on 30/03/16.
 */
public class PeoplePersonne extends Personne implements IPerson{
    public PeoplePersonne(String s, String s1, int i, int i1, int i2) {
        super(s, s1, i, i1, i2);
    }

    @Override
    public boolean wasBorn(GregorianCalendar gregorianCalendar) {
        return !gregorianCalendar.before(this.dateNaissance);
    }
}
