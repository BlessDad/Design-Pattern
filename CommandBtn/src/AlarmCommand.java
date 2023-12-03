public class AlarmCommand implements Command {

    @Override
    public void execute() {
        new Alarm().start();
    }
}
