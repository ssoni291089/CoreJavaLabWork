package clothing;

import java.awt.*;

/**
 * Created by shsoni on 9/21/2016.
 */
public class Fabric implements Colored {
    private Color color;

    public  Fabric(Color color)
    {
        this.color= color;

    }

    @Override
    public Color getColor() {
        return this.color;
    }


}
