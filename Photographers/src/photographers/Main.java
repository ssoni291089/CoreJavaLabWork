package photographers;

public class Main {

    public static void main(String[] args) {

        Parents[] parents = new Parents[3];

        for(int i=0; i< parents.length ; i++)
        {
            parents[i] = new Parents();
            parents[i].prepareScene();
            System.out.println( parents[i].takePhotograph());
            System.out.println("--------------------");
        }

        TrafficCamera[] trafficCameras = new TrafficCamera[2];

        for(int i =0; i< trafficCameras.length; i++)
        {
            trafficCameras[i] = new TrafficCamera();
            trafficCameras[i].prepareScene();
            System.out.println(trafficCameras[i].takePhotograph());
            System.out.println("--------------------");
        }

        SpySatellite[] spySatellites = new SpySatellite[2];

        for(int i =0; i< spySatellites.length; i++)
        {
            spySatellites[i] = new SpySatellite();
            spySatellites[i].prepareScene();
            System.out.println(spySatellites[i].takePhotograph());
            System.out.println("--------------------");

        }
}
}
