public abstract class NaviFactory {
    // abstract factory method
    public abstract Gps getGps();
    public abstract Screen getScreen();
    public abstract Map getMap();
    public abstract PathFinder getPathFinder();
}
