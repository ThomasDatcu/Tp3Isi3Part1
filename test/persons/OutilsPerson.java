package persons;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by thomas on 30/03/16.
 */
public class OutilsPerson {


    public List<IPerson> methodeQ5(List<IPerson> list, GregorianCalendar gregorianCalendar, int ageMin, int ageMax){
        List<IPerson> res = new ArrayList<>();
        if(ageMax<ageMin){
            throw new IllegalArgumentException();
        }
        for (IPerson p: list)
        {
            if(p.wasBorn(gregorianCalendar)){
                if(ageMin<p.getAge(gregorianCalendar) && p.getAge(gregorianCalendar) < ageMax){
                    res.add(p);
                }
            }
        }
        return res;
    }
}
