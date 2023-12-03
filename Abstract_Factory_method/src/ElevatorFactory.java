public class ElevatorFactory {
    public static Elevator createEleveator(VendorId vendorId){
        Elevator elevator = null;

        switch(vendorId){
            case LG: elevator = new LG_Elevator(); break;
            case HYUNDAI: elevator = new HYUNDAI_Elevator(); break;
        }

        return elevator;
    }
}
