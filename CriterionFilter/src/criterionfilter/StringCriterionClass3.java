package criterionfilter;

/**
 * Created by shsoni on 9/19/2016.
 */
//Class that implements StringCriterion interface accept a generic input and check if the length is equal to a threshold value
public class StringCriterionClass3 implements StringCriterion {

    private int threshold;

    public  StringCriterionClass3()
    {}

    public  StringCriterionClass3(int threshold)
    {
        this.threshold = threshold;

    }

    @Override
    public boolean check(Object input) {


        if (input.toString().length() == threshold) {
            return true;
        }
        else {return false;}

    }
}

