public class Samsung_Door extends Door{
    @Override
    protected void doClose() {
        System.out.println("Samsung Door is closing");
    }

    @Override
    protected void doOpen() {
        System.out.println("Samsung Door is opening");

    }
}
