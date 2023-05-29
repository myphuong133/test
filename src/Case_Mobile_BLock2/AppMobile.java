package Case_Mobile_BLock2;

public class AppMobile {
    public static void main(String[] args) {
        Mobile objMobile1 = new Mobile();
        objMobile1.setManufacturerMobile("Samsung");
        objMobile1.setColor("Yellow");
        objMobile1.setWidth(15);
        objMobile1.display();

        Mobile objMobile2 = new Mobile("Apple");
        objMobile2.setLength(12);
        objMobile2.setWidth(20);
        objMobile2.setBattery(100);
        objMobile2.display();


    }
}
