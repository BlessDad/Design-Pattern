public class Path {
    private Coordinate start;
    private Coordinate dest;

    public Path(Coordinate start, Coordinate dest) {
        this.start = start;
        this.dest = dest;
    }

    public String toString() {
        return " Path from : " + start + " to " + dest;
    }
}
