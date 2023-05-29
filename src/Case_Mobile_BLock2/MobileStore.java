package Case_Mobile_BLock2;

import java.util.Scanner;

public class MobileStore{
    private Mobile[] mobileList ;
    private int mobileNumber;
    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public MobileStore(){
        this.mobileList = new Mobile[100];
        this.mobileNumber = 0;
    }
    public MobileStore(int mobileLength) {
        this.mobileList = new Mobile[mobileLength];
        this.mobileNumber = 0;
    }
    public boolean add(Mobile mb){
        Mobile[] copyMobileList = new Mobile[this.mobileNumber+1];
        for (int i = 0; i< mobileNumber ; i++){
            copyMobileList[i] = mobileList[i];
        }
        copyMobileList[mobileNumber] = mb;
        this.mobileList = copyMobileList;
        mobileNumber++;
        return true;
    }
    public boolean sold(String MobileCode){
        Mobile[] copyMobileList = new Mobile[this.mobileNumber - 1];
        int i=0;
        for (Mobile mb:
             this.mobileList) {
            if(mb.getMobileCode().equals(MobileCode)){
                continue;
            }
            copyMobileList[i] = mb;
            i++;
        }
        this.mobileList = copyMobileList;
        return true;
    }
    public boolean update(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vị trí điện thoại");
        int index = sc.nextInt();
        System.out.println("Nhập mã điện thoại");
        sc.nextLine();
        String phoneCode = sc.nextLine();
        System.out.println("Nhập hãng sản xuất");
        String phongManufacturer = sc.nextLine();
        System.out.println("Nhập Màu");
        String phoneColor = sc. nextLine();
        System.out.println("Nhập chiều rộng");
        int phoneWidth = sc.nextInt();
        System.out.println("Nhập chiều dài");
        int phoneLength = sc.nextInt();
        System.out.println("Nhập độ dày");
        int phoneHeight = sc.nextInt();
        System.out.println("Nhập Pin");
        int phoneBattery = sc.nextInt();

        Mobile mb = new Mobile(phoneCode,phongManufacturer,phoneColor,phoneWidth,phoneLength,phoneHeight,phoneBattery);
        mobileList[index-1] = mb;
        return true;
    }

    public void display(){
        int i = 0;
        for (Mobile mb:
             this.mobileList) {
            i++;
            System.out.print("Vị trí:" + i + " || ");
            System.out.println(mb.toStringList());

        }
    }

}
