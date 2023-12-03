public class RoadDisplayWithCrossing extends DisplayDecorator{
    public RoadDisplayWithCrossing(Display display) {
        super(display);
    }

    @Override
    public void draw(){
        super.draw();
        drawCrossing();
    }

    private void drawCrossing(){
        System.out.println("Cross road display");
    }
}
