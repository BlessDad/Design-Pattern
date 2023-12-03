import java.awt.*;

public class Hongro extends Apple{
    @Override
    public void wash() {
        System.out.println("홍로를 씻습니다.");
    }

    @Override
    public void peel() {
        System.out.println("홍로를 peel 합니다.");

    }

    @Override
    public void slice() {
        System.out.println("홍로를 깎습니다.");

    }
}
