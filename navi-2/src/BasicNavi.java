public class BasicNavi extends NaviFm {
    @Override
    protected Map getMap() {
        return new SmallMap();
    }

    @Override
    protected PathFinder getPathFinder() {
        return new SlowPathFinder();
    }

    @Override
    protected Screen getScreen() {
        return new SDScreen();
    }

    @Override
    protected Gps getGps() {
        return new CheapGps();
    }
}
