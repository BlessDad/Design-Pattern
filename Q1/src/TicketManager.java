import java.util.Optional;

public class TicketManager {
    private int count;
    private final int LIMITS = 2;
    private static TicketManager tm;
    public TicketManager(){
        count = 0;
    }

    public Optional<Ticket> issue(){
        if (count >= LIMITS) return Optional.empty();
        return Optional.of(new Ticket(count++));
    }

    public static TicketManager getTM(){
        if (tm == null) tm = new TicketManager();
        return tm;
    }
}
