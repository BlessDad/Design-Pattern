public class Main {
    public static void main(String[] args) {

        Printer print = new Printer();
        new Thread(()-> {
            print.print1();
        }).start();

        new Thread(()-> {
            print.print2();
        }).start();


    }


}