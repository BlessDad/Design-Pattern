public class LampFactory {
    public static Lamp createLamp (VendorId vendorId){
        Lamp lamp = null;

        switch(vendorId){
            case LG: lamp = new LG_Lamp(); break;
            case HYUNDAI: lamp = new HYUNDAI_Lamp(); break;
        }

        return lamp;
    }
}
