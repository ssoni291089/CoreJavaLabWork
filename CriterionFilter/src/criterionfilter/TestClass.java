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
    List<String> ls = Arrays.asList("Fred", "Jim", "William", "Susannah", "Lucy", "Orinoco", "Toby");
    List<String> longStrings = Main.StringFilter( ls, new StringCriterionClass1());
    assert longStrings.size() == 3;
    assert longStrings.get(0).equals("William");
    assert longStrings.get(1).equals("Susannah");
    assert longStrings.get(2).equals("Orinoco");

}

    @Test
    public void testMethod3()
    {
        List<String> ls = Arrays.asList("Fred", "Jim", "William", "Susannah", "Lucy", "Orinoco", "Toby");
        List<String> longStrings = Main.StringFilter( ls, new StringCriterionClass2());
        assert longStrings.size() == 3;
        assert longStrings.get(0).equals("Fred");
        assert longStrings.get(1).equals("Lucy");
        assert longStrings.get(2).equals("Toby");

    }

}
