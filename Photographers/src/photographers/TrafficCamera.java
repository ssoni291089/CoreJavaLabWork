package photographers;

/**
 * Created by shsoni on 9/14/2016.
 */
public class TrafficCamera implements Photographer {

    @Override
    public void prepareScene()
    {
        System.out.println( "Marked towards the cars stopped at the red light");
    }

    @Override
    public String takePhotograph()
    {
        return "All cars stopped behind the line";
    }
}
