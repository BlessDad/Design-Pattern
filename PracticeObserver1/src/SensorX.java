public class SensorX implements ObserverX {
    private Vector vector;
    public SensorX(Vector v){
        this.vector = v;
    }

    @Override
    public void update() {

        if (vector.getX() >= 50) System.out.println("x is over than 50 now " + vector.getX());
    }
}
