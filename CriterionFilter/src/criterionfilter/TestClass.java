package criterionfilter;
import org.junit.Test;
import java.util.*;


/**
 * Created by shsoni on 9/19/2016.
 */
public class TestClass  {



    @Test
    public void testMethod1()
{
    List<String> ls = Arrays.asList("Fred", "Jim", "William", "Susannah", "Lucy", "Orinoco", "Toby");
    List<String> longStrings = Main.getLongStrings(ls, 6);

    assert longStrings.size() == 3;
    assert longStrings.get(0).equals("William");
    assert longStrings.get(1).equals("Susannah");
    assert longStrings.get(2).equals("Orinoco");

}

@Test
public void testMethod2()
{
    List<Object> ls = Arrays.asList("Fred", "Jim", "William", "Susannah", "Lucy", "Orinoco", "Toby");
    StringCriterion stringCriterion = new StringCriterionClass1(6);
    List<Object> longStrings = Main.StringFilter( ls, stringCriterion);
    assert longStrings.size() == 3;
    assert longStrings.get(0).equals("William");
    assert longStrings.get(1).equals("Susannah");
    assert longStrings.get(2).equals("Orinoco");

}

    @Test
    public void testMethod3()
    {
        List<Object> ls = Arrays.asList("Fred", "Jim", "William", "Susannah", "Lucy", "Orinoco", "Toby");
        StringCriterion stringCriterion =  new StringCriterionClass2("^[A-M].*$");
        List<Object> longStrings = Main.StringFilter( ls, stringCriterion);
        assert longStrings.size() == 3;
        assert longStrings.get(0).equals("Fred");
        assert longStrings.get(1).equals("Jim");
        assert longStrings.get(2).equals("Lucy");

    }

    @Test
    public void testMethod4()
    {
        List<Object> ls = Arrays.asList("Fred", "Jim", "William", "Susannah", "Lucy", "Orinoco", "Toby");
        StringCriterion stringCriterion =  new StringCriterionClass3(4);
        List<Object> longStrings = Main.StringFilter( ls, stringCriterion);
        assert longStrings.size() == 3;
        assert longStrings.get(0).equals("Fred");
        assert longStrings.get(1).equals("Lucy");
        assert longStrings.get(2).equals("Toby");

    }

    @Test
    public void testMethod5()
    {
        List<Object> ls = Arrays.asList(10, 3, 5, 11, 9, 7, 3, 8);
        StringCriterion stringCriterion =  new StringCriterionClass1(6);
        List<Object> longStrings = Main.StringFilter( ls, stringCriterion);
        assert longStrings.size() == 5;
        assert longStrings.get(0).equals(10);
        assert longStrings.get(1).equals(11);
        assert longStrings.get(2).equals(9);


    }


}
