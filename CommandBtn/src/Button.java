enum Mode{LAMP, ALARM}

public class Button {
    private Command theCommand;

    public void setTheCommand(Command cmd){
        this.theCommand = cmd;
    }

    public void pressed(){
        theCommand.execute();
    }

}
