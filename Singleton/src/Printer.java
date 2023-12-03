public class Printer {
    private int n = 10;
    private Printer(){

    }

    private static Printer instance;
    public static Printer getInstance(){
        if (instance == null) instance = new Printer();
        return instance;
    }

    public void printP(){
        System.out.println("프린터가 출력중입니다...");
    }

    public void up(){
        n++;
    }

    public int nn(){
        return n;
    }
}
