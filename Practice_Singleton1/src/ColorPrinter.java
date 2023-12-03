import java.awt.*;

public class ColorPrinter {

    // 다중 스레드 환경에서의 싱글톤이다.
    // DCL, Synchrnozie (사실상 동일) 하지만 차이점이라 한다면
    // DCL 은 클래스를 Synchronize 하는데에 있다.
    private int i = 0;

    private ColorPrinter(){
        System.out.println("ColorPrinter ON");
    }

    private static class LazyHolder{
        private static ColorPrinter colorPrinter = new ColorPrinter();
    }

    public static ColorPrinter getColorPrinter(){
        return LazyHolder.colorPrinter;
    }

    public void print(){
        System.out.println("ColorPrinter is printing now " + i);
        i++;
    }


}
