public class Main {
    public static void main(String[] args) {
        Adder adder = new MyAdder();
        UseAdder useAdder = new UseAdder();
        System.out.println(useAdder.add(adder,10 , 3));

        Adder adder1 = new YourAdderAdapter(new YourAdder());
        System.out.println(adder1.plus(10,50));

    }
}