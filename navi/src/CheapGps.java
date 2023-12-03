public class CheapGps extends Gps {
    @Override
    public Coordinate findCurrentocation() {
        return new Coordinate(Math.random()*90, Math.random()*180);
    }
}
