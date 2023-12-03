public class DarkPrinter {

    // 멀티스레드에서는 적용하지 못하는.. 싱글톤. 가장 기초적이긴 하다.
    // eager initialization 과의 차이는 인스턴스를 미리 생성하느냐 아니냐의 차이일 뿐이다.
    private int i = 0;
    private static DarkPrinter darkPrinter;
    // 흑백 프린터. 가장 기초적인 싱글톤 기법을 사용하자.


    private DarkPrinter(){
        // 객체 생성 불가하다.
    }

    public static DarkPrinter getDarkPrinter(){
        // 가장 기초적인 싱글턴 기법.
        if (darkPrinter == null) darkPrinter = new DarkPrinter();
        return darkPrinter;
    }

    public void print(){
        System.out.println("DarkPrinter is printing now " + i);
        i++;
    }

}
