package criterionfilter;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //calling the test methods
        TestClass tc = new TestClass();

        tc.testMethod1();

        tc.testMethod2();

        tc.testMethod3();

        tc.testMethod4();

        tc.testMethod5();
    }


    public static List<String> getLongStrings(List<String> ls, int thresLength)
    {
        List<String> outputString = new ArrayList<>();

        for(String s : ls)
        {
            if(s.length() > thresLength)
            {
                outputString.add(s);
            }

        }
        return outputString;
    }

    //generalizing things
    public static List<Object> StringFilter(List<Object> ls, StringCriterion sc)
    {
        List<Object> outputLs = new ArrayList<>();
        for(Object s : ls)
        {
            if(sc.check(s))
            {
                outputLs.add(s);
            }

        }

        return outputLs;
    }
}