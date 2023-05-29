package Case_Mobile_BLock2;

public class AppMobileStore {
    public static void main(String[] args) {
        Mobile mb1 = new Mobile("MS1");
        Mobile mb2 = new Mobile("MS2");
        Mobile mb3 = new Mobile("MS3");
        Mobile mb4 = new Mobile("MS4");
        Mobile mb5 = new Mobile("MS5");
        Mobile mb6 = new Mobile("MS6");
        Mobile mb7 = new Mobile("MS7");
        Mobile mb8 = new Mobile("MS8");
        Mobile mb9 = new Mobile("MS9");
        Mobile mb10 = new Mobile("MS10");

        MobileStore mbs = new MobileStore();
        mbs.add(mb1);
        mbs.add(mb2);
        mbs.add(mb3);
        mbs.add(mb4);
        mbs.add(mb5);
        mbs.add(mb6);
        mbs.add(mb7);
        mbs.add(mb8);
        mbs.add(mb9);
        mbs.add(mb10);

        mbs.display();

        mbs.sold("MS1");
        System.out.println();
        System.out.println();
        mbs.display();

        mbs.update();
        System.out.println();
        System.out.println();
        mbs.display();
    }
}
