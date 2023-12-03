public class BirdSingingCmd implements Command{
    private Bird bird;
    public BirdSingingCmd(Bird bird){
        this.bird = bird;
    }
    @Override
    public void execute(){
        bird.sing();
    }
}
