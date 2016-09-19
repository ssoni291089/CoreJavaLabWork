package criterionfilter;

/**
 * Created by shsoni on 9/19/2016.
 */
//Class that implements StringCriterion interface to check of the length of the string is equal to 4
public class StringCriterionClass3 implements StringCriterion {

    @Override
    public Boolean stringCheck(String s) {

        if (s.length() == 4) {
            return true;
        }
        else {return false;}

    }
}

