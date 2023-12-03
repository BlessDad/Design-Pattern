import java.util.ArrayList;
import java.util.List;

public abstract class ReportGenerator {
    public String generate(List<Customer> customers){
        List<Customer> selectedCustomers = select(customers);
        // 심플로 할지, 컴플렉스 할지를 선택해줘야 한다.
        String report = header(selectedCustomers);
        // 그리고 헤더를 붙인다.
        for (Customer customer : selectedCustomers){
            report += getReportForCustomer(customer);
        }

        report += footer(selectedCustomers);
        // 마지막으론 footer 를 붙인다.
        return report;
    }

    protected abstract String getReportForCustomer(Customer customer);

    protected abstract String footer(List <Customer> customers);

    // 머리말 정의
    protected abstract String header(List<Customer> selectedCustomers);

    protected List<Customer> select(List<Customer> customers) {
        List<Customer> selected = new ArrayList<>();
        for (Customer customer : customers) {
            if (customerCondition(customer))
                selected.add(customer);
        }
        return selected;
    }

    protected abstract boolean customerCondition(Customer customer);
}
