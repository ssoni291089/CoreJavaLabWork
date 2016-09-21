package clothing;

import java.awt.*;

public class Main {

    public static void main(String[] args) {



        Glove glove1 = new Glove(Color.black, 6);
        Glove glove2 = new Glove(Color.black, 6);
        Glove glove3 = new Glove(Color.black, 8);

        Sock sock1 = new Sock(Color.red, 10);
        Sock sock2 = new Sock(Color.red, 10);
        Sock sock3 = new Sock(Color.gray, 10);


        ClothingPair<Glove> pairGloveSet1 = new ClothingPair<Glove>(glove1, glove2);
        ClothingPair<Sock> pairSockSet1 = new ClothingPair<Sock>(sock1, sock2);

        ClothingPair<Glove> pairGloveSet2 = new ClothingPair<Glove>(glove1, glove3);
        ClothingPair<Sock> pairSockSet2 = new ClothingPair<Sock>(sock1, sock3);



        //testing the isMatched method
      pairGloveSet1.isMatched();
        pairGloveSet2.isMatched();
        pairSockSet1.isMatched();
        pairSockSet2.isMatched();


        //implementing fabric and glass vase
        Fabric fabric1 = new Fabric(Color.blue);
        GlassVase gv1 = new GlassVase(7);

        System.out.println("The color of the fabric is : " + fabric1.getColor().toString());
        System.out.println("-------------------------------------------------------");
        System.out.println("The size of the glass vase is " + gv1.getSize());
        System.out.println("-------------------------------------------------------");

    }


    }
