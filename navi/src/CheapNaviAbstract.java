public class CheapNaviAbstract extends NaviAbstractF{
    @Override
    public Gps getGps() {
        return new CheapGps();
    }

    @Override
    public Screen getScreen() {
        return new SDScreen();
    }

    @Override
    public Map getMap() {
        return new SmallMap();
    }

    @Override
    public PathFinder getPathFinder() {
        return new SlowPathFinder();
    }
}
