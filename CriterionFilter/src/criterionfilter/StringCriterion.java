package criterionfilter;

/**
 * Created by shsoni on 9/19/2016.
 */
//Interface to generalize String Criterion check
public interface StringCriterion<U> {

public <U> boolean check(Object input);

}
