public class DoorFactory {
    public static Door createDoor (VendorId vendorId){
        Door door = null;

        switch(vendorId){
            case LG: door = new LG_Door(); break;
            case HYUNDAI: door = new HYUNDAI_Door(); break;
        }

        return door;
    }
}
