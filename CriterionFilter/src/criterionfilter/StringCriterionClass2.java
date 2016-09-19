package criterionfilter;

/**
 * Created by shsoni on 9/19/2016.
 */

//Class that implements StringCriterion interface to check of the string starts between alphabets A-M
public class StringCriterionClass2 implements StringCriterion {

    @Override
    public Boolean stringCheck(String s) {

        if(s.matches("^[A-M].*$")) {
            return true;
        }

        else{return false;}
    }
}
