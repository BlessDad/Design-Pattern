public class Main {
    public static void main(String[] args) {

       MenuItem m = new MenuItem();
       m.buttonPressed(new PizzaCookCmd(new Pizza()));
       m.buttonPressed(new CarOnCmd());

    }
}