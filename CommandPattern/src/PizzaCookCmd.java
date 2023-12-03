public class PizzaCookCmd implements Command{
    private Pizza pizza;
    public PizzaCookCmd(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public void execute(){
        pizza.cook();
    }
}
