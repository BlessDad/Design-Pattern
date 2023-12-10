public class setNaviAbstractFactory {
    // abstract factory 로 만든 네비에 기능 부여
    private NaviAbstractF naviAbstractFactory;
    public setNaviAbstractFactory(NaviAbstractF navi){
        this.naviAbstractFactory = navi;
    }

    public Path findPath(Coordinate dest){
        Gps gps = naviAbstractFactory.getGps();
        Screen screen = naviAbstractFactory.getScreen();
        PathFinder pathFinder = naviAbstractFactory.getPathFinder();
        Map map = naviAbstractFactory.getMap();
        screen.drawMap(map);
        Coordinate currentLocation = gps.findCurrentocation();
        Path path = pathFinder.pathFinder(currentLocation, dest);
        return path;

    };

}
