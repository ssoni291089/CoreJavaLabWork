package casinogame;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public enum MachineStates {
        BAR, MEDAL, COIN, DOUBLEBAR, TRIPLEBAR, CHERRY, CROSS, JOKER, APPLE, BLANK;
    }
    public static void main(String[] args) {

        int[] wheels = new int[3];
        for(int i =0; i<3; i++)
        {
            wheels[i] = ThreadLocalRandom.current().nextInt(0, 9);

        }

        for(int wheel : wheels)
        {
            System.out.print(MachineStates.values()[wheel] + "  ");

        }

    }

}
