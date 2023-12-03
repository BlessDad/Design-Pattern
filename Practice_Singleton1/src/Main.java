public class Main {
    public static void main(String[] args) {
        // 가장 근본적인 기능인 프린트로 해보자. => 흑백 프린터
        // 회사에서 여러 사람이 프린터를 이용, 때문에 단 하나의 프린터만이 필요하다.

        DarkPrinter d1 = DarkPrinter.getDarkPrinter();
        DarkPrinter d2 = DarkPrinter.getDarkPrinter();
        DarkPrinter d3 = DarkPrinter.getDarkPrinter();

        d1.print();
        d2.print();
        d3.print();

        ColorPrinter c1 = ColorPrinter.getColorPrinter();
        ColorPrinter c2 = ColorPrinter.getColorPrinter();
        ColorPrinter c3 = ColorPrinter.getColorPrinter();

        c1.print();
        c2.print();
        c3.print();




    }
}