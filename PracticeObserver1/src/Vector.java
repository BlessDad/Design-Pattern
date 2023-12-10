import java.util.ArrayList;

public class Vector {
    // 벡터를 기점으로, 좌표가 변하면 알려주는 옵저버를 만든다고 생각해보자.

    Observer o;

    private float x, y, z;

    public Vector(Observer o){
        // 처음엔 0 으로 초기화
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.o = o;
    }


    public void moveX(){
        this.x += 10;
        o.update();
    }

    public void attach(ObserverX o){
        this.o.addOb(o);
    }

    public float getX(){
        return this.x;
    }



}
