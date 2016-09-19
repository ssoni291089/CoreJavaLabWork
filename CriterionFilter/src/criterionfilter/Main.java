package criterionfilter;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        TestClass tc = new TestClass();

        tc.testMethod1();

        tc.testMethod2();

        tc.testMethod3();
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

    public static List<String> StringFilter(List<String> ls, StringCriterion sc)
    {
        List<String> outputString = new ArrayList<>();
        for(String s : ls)
        {
            if(sc.stringCheck(s))
            {
                outputString.add(s);
            }

        }

        return outputString;
    }
}