public abstract class RobotGame {

    public void play(){
        Robot r = RobotFactory.getRobot();
        r.makeSound();
        r.attack();
    }

    protected abstract Robot getRobot();
}
