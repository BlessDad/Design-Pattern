public class displayX implements ObserverX{
    private Vector vector;
    public displayX(Vector v){
        this.vector = v;
    }
    @Override
    public void update() {
        System.out.println("vector is move to " + vector.getX());
    }
}
