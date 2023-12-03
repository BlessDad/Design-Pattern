public class Main {
    public static void main(String[] args) {
        RoadDisplay roadDisplay = new RoadDisplay();
        Display traffic = new RoadDisplayWithTraffic(roadDisplay);

        DisplayDecorator trafficAndCrossing = new RoadDisplayWithCrossing(traffic);

        trafficAndCrossing.draw();

        }

}