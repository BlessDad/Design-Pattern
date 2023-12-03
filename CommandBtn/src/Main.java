public class Main {
    public static void main(String[] args) {
        Command cmd = new AlarmCommand();
        Button btn = new Button();
        btn.setTheCommand(cmd);
        btn.pressed();
    }
}