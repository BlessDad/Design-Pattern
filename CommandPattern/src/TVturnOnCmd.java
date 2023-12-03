public class TVturnOnCmd implements Command{
    private TV tv;
    public TVturnOnCmd(TV tv){
        this.tv = tv;
    }
    @Override
    public void execute(){
        tv.turnOn();
    }
}
