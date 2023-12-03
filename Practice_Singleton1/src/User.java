public class User extends Thread{
    @Override
    public void run(){
        DarkPrinter dark = DarkPrinter.getDarkPrinter();
        dark.print();
        dark.print();
    }
}
