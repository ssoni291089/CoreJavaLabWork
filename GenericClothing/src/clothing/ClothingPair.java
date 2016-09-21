package clothing;
import java.util.*;

/**
 * Created by shsoni on 9/18/2016.
 */
/**
 * Generic version of the ClothingPair class.
 * @param <T> the type of the value being boxed
 */
//bounded types mechanism to restrict the Pair to accepting only items that implement the Colored and Sized interface
public class ClothingPair<T extends Colored & Sized>{
// paired items
private T tItem1;
private T tItem2;

        // unpaired items - fabric and glass vase
        private T uItem1;

public ClothingPair(T tItem1,T tItem2){
        this.tItem1=tItem1;
        this.tItem2=tItem2;
        }

        public ClothingPair(T uItem1 )
        {
                this.uItem1=uItem1;
        }

//implementing the isMatched method
public boolean isMatched(){
        if((tItem1.getSize() ==tItem2.getSize()) && (tItem1.getColor()==tItem2.getColor()))
        {
                System.out.println( "It is a match");
                System.out.println("The color of the items is : " + tItem1.getColor().toString());
                System.out.println("The size of the  items is " + tItem1.getSize());
                System.out.println("-------------------------------------------------------");
            return true;

        }
        else
        {
                System.out.println("It is NOT a match");
                System.out.println("-------------------------------------------------------");
            return false;
        }

}
}