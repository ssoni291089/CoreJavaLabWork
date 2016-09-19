package criterionfilter;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        TestClass tc = new TestClass();
        tc.testMethod();

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
}