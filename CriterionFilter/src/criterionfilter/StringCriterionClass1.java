package criterionfilter;

/**
 * Created by shsoni on 9/19/2016.
 */

//Class that implements StringCriterion interface to accept a generic input and check if the length is greater than a threshold value
public class StringCriterionClass1 implements StringCriterion {

    private int threshold;

    public  StringCriterionClass1()
    {}

    public  StringCriterionClass1(int threshold)
    {
       this.threshold = threshold;

    }
    @Override
    public boolean check(Object input) {


        if (input.toString().length() > threshold) {
            return true;
        }
else {return false;}

    }
}