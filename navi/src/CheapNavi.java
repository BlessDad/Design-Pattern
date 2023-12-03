public class CheapNavi extends NaviGoF{
    @Override
    protected Gps getGps() {
        return new CheapGps();
    }

    @Override
    protected Screen getScreen() {
        return new SDScreen();
    }

    @Override
    protected PathFinder getPathFinder() {
        return new SlowPathFinder();
    }

    @Override
    protected Map getMap() {
        return new SmallMap();
    }
}
