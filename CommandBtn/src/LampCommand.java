public class LampCommand implements Command{
    @Override
    public void execute(){
        new Lamp().turnOn();
    }
}
