package clothing;

import java.awt.*;

/**
 * Created by shsoni on 9/18/2016.
 */
public class Sock  implements Colored, Sized{

    private Color color;
    private int size;

    public  Sock(Color color, int size)
    {
        this.color= color;
        this.size = size;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public int getSize() {
        return this.size;
    }
}
