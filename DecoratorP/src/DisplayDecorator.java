public class DisplayDecorator extends Display{
    private Display display;
    // 자기 자신을 참조할 수 있어야 한다.
    public DisplayDecorator (Display display){
        this.display = display;
    }
    public void draw(){
        display.draw();
    };
}
