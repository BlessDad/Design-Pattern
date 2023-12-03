import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer("hj", 50));
        customers.add(new Customer("mh", 250));
        customers.add(new Customer("chani", 450));
        ReportGenerator sg = new SimpleReportGenerator();
        ReportGenerator cg = new ComplexReportGenerator();
        System.out.println(sg.generate(customers));
        System.out.println(cg.generate(customers));
    }
}