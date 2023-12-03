public class MotorFactory {
    public static Motor createMotor(VendorId vendorId){
        Motor motor = null;

        switch(vendorId){
            case LG: motor = new LG_Motor(); break;
            case HYUNDAI: motor = new HYUNDAI_Motor(); break;
        }

        return motor;
    }
}
