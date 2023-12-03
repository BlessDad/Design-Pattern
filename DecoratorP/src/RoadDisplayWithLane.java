public class RoadDisplayWithLane extends DisplayDecorator{


    public RoadDisplayWithLane(Display display) {
        super(display);
    }

    public void draw(){
        super.draw();
        drawLane();
    }
    public void drawLane(){

        System.out.println("Road display with lane");
    }
}
