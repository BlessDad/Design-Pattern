public class Main {
    public static void main(String[] args) {
        NaviGoF navi = new CheapNavi();
        Path path = navi.findPath(new Coordinate(30, 110));
        System.out.println(path);

        setNaviAbstractFactory navi2 = new setNaviAbstractFactory();
        navi2.setNaviAbstractFactory(new CheapNaviAbstract());
        Path path2 = navi2.findPath(new Coordinate(20, 100));
        System.out.println(path2);


    }
}
