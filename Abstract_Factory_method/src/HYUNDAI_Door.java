public class HYUNDAI_Door extends Door{
    @Override
    protected void doClose() {
        System.out.println("HYUNDAI Door is closing now");
    }

    @Override
    protected void doOpen() {
        System.out.println("HYUNDAI Door is opening now");

    }
}
