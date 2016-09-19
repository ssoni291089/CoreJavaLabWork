package listlike;
import java.util.*;
import org.junit.Test;

/**
 * Created by shsoni on 9/18/2016.
 */
public class TestClass {

    @Test
    public void testMethod()
    {
        Sequence s = new Sequence();
        assert s.size() == 0;
        s.add("Hello");
        s.add("there");
        assert s.size() == 2;
        assert s.get(0).equals("Hello");
        assert s.get(1).equals("there");
        s.add("done");
        assert s.size() == 3;
        assert s.get(0).equals("Hello");
        assert s.get(1).equals("there");
        assert s.get(2).equals("done");

        Sequence s1 = new Sequence();
        s1.add("Hello");
        s1.add("there");
        s1.add("done");
        Iterator i1 = s1.iterator();
        Iterator i2 = s1.iterator();
        assert i1.hasNext();
        assert i1.next().equals("Hello");
        assert i1.hasNext();
        assert i1.next().equals("there");
        assert i2.hasNext();
        assert i2.next().equals("Hello");
        assert i1.hasNext();
        assert i1.next().equals("done");
        assert i1.hasNext() == false;
        assert i2.next().equals("there");
        assert i2.next().equals("done");
        assert i2.hasNext() == false;




    }
}
