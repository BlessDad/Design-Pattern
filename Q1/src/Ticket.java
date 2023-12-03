public class Ticket {
    private int serialNum;
    public int getSerialNum(){
        return serialNum;
    }
    private TicketManager tm;
    public void setSerialNum(int serialNum){
        this.serialNum = serialNum;
    }
    public Ticket(int serialNum){
        this.serialNum = serialNum;
        this.tm = TicketManager.getTM();
    }
}
