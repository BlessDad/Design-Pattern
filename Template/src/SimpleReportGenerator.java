import java.util.List;

public class SimpleReportGenerator extends ReportGenerator{

    @Override
    protected String getReportForCustomer(Customer customer) {
        return String.format("%s : %d\n", customer.getName(), customer.getPoint());
    }

    @Override
    protected String footer(List<Customer> customers) {
        return ("I'm simple. foot Nothing\n");
    }

    @Override
    protected String header(List<Customer> selectedCustomers) {
        return String.format("Too Simple: Number of customer: %d\n", selectedCustomers.size());
    }

    @Override
    protected boolean customerCondition(Customer customer){
        return true;
        // 심플레포트는 별다른 제약이 없다. 모두 true
    }


}
