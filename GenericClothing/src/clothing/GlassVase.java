package clothing;


/**
 * Created by shsoni on 9/21/2016.
 */
public class GlassVase implements Sized{

    private int size;

    public  GlassVase(int size)
    {

        this.size = size;
    }



    @Override
    public int getSize() {
        return this.size;
    }
}
