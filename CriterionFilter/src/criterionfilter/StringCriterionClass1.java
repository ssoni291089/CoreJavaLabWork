package criterionfilter;

/**
 * Created by shsoni on 9/19/2016.
 */

//Class that implements StringCriterion interface to check of the length of string is greater than 6
public class StringCriterionClass1 implements StringCriterion {

    @Override
    public Boolean stringCheck(String s) {

        if (s.length() > 6) {
            return true;
        }
else {return false;}

    }
}