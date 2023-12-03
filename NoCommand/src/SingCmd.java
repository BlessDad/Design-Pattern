public class SingCmd implements Cmd{
    @Override
    public void execute(){
        new Bird().sing();
    }
}
