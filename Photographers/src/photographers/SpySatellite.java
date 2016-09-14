package photographers;

/**
 * Created by shsoni on 9/14/2016.
 */
public class SpySatellite implements Photographer {

    @Override
    public void prepareScene()
    {
        System.out.println("marked towards international waters");
    }

    @Override
    public String takePhotograph() {
        return "all clear - calm blue waters";
    }
}
