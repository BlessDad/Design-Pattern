public class Coordinate {
    private double latitude;
    private double longtitude;

    public Coordinate(double latitude, double longtitude) {
        this.latitude = latitude;
        this.longtitude = longtitude;
    }
    // return string representation of this point
    public String toString() {
        return " (" + latitude + ", " + longtitude + ")";
    }
}
