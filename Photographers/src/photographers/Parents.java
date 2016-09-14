package photographers;

/**
 * Created by shsoni on 9/14/2016.
 */
public class Parents implements Photographer {

    @Override
    public void prepareScene()
    {
      System.out.println( "hey kids, stand over there and smile!");
    }

    @Override
    public String takePhotograph()
    {
        return "lots of cheesy grins, and the younger sister is pulling a face";
    }
}
