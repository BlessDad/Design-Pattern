public class NaviAF {
    private NaviFactory naviFactory;

    public void setNaviFactory(NaviFactory naviFactory) {
        this.naviFactory = naviFactory;
    }

    public Path findPath(Coordinate dest) {
        Gps gps = naviFactory.getGps();
        Screen screen = naviFactory.getScreen();
        PathFinder pathFinder = naviFactory.getPathFinder();
        Map map = naviFactory.getMap();
        screen.drawMap(map);
        Coordinate currentLocation = gps.findCurrentocation();
        Path path = pathFinder.pathFinder(currentLocation, dest);
        return path;
    }
}
