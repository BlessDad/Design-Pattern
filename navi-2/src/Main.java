public class Main {
    public static void main(String[] args) {
//        Navi navi = new Navi();
//        Path path = navi.findPath(new Coordinate(30, 110));
//        System.out.println(path);

//        NaviFm navi = new BasicNavi();
//        Path path = navi.findPath(new Coordinate(30, 110));
//        System.out.println(path);

        NaviFactory basic = new BasicNaviFactory();
        NaviAF navi = new NaviAF();
        navi.setNaviFactory(basic);
        Path path = navi.findPath(new Coordinate(30, 110));
        System.out.println(path);
    }
}
