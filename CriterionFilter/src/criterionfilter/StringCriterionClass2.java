package criterionfilter;

/**
 * Created by shsoni on 9/19/2016.
 */

//Class that implements StringCriterion interface accept a generic input and check if  it matches a regex or another string
public class StringCriterionClass2 implements StringCriterion {

   private String matchString;

    public  StringCriterionClass2()
    {}

    public  StringCriterionClass2(String matchString)
    {
        this.matchString = matchString;

    }

    @Override
    public boolean check(Object input) {

        if(input.toString().matches(matchString)) {
            return true;
        }
        else{return false;}


    }
    }

