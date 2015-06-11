package staffstutorial6;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Alexandre Ravaux
 */
public class DVDComparator implements Comparator{
    public DVDComparator() {}

    @Override
    public int compare(Object o1, Object o2) {
        DVD d1=(DVD)o1;
        DVD d2=(DVD)o2;
        if(d1.getNoOfStars()>d2.getNoOfStars()){
            return 1;
        }else if(d1.getNoOfStars()<d2.getNoOfStars()){
            return -1;
        }else {
            return 0;
        }
    }
}
