public class LG_Door extends Door{

    @Override
    protected void doClose() {
        System.out.println("LG Door is closing now");
    }

    @Override
    protected void doOpen() {
        System.out.println("LG Door is opening now");

    }
}
