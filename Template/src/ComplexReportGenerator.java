import java.util.ArrayList;
import java.util.List;

public class ComplexReportGenerator extends ReportGenerator {


    @Override
    protected String getReportForCustomer(Customer customer) {
        return String.format("%s : %d\n", customer.getName(), customer.getPoint());
    }

    @Override
    protected String footer(List<Customer> customers) {
        int total = 0;
        for (Customer c : customers){
            total += c.getPoint();
        }
        return String.format("Total Point: %d\n", total);
    }

    @Override
    protected String header(List<Customer> selectedCustomers) {
        return String.format("I'm Complex: Number of customer: %d\n", selectedCustomers.size());
    }

    @Override
    protected boolean customerCondition(Customer customer) {
        return customer.getPoint() >= 100;
        // 100점 이상만 true 리턴하기.
    }
}
