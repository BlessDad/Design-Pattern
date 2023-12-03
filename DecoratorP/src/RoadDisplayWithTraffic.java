public class RoadDisplayWithTraffic extends DisplayDecorator{


    public RoadDisplayWithTraffic(Display display) {
        super(display);
    }

    public void draw(){
        super.draw();
        drawTraffic();

    }

    private void drawTraffic(){
        System.out.println("Traffic Display");
    }
}
