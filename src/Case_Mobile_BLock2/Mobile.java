package Case_Mobile_BLock2;

import java.util.StringJoiner;

public class Mobile {
    private String mobileCode,manufacturerMobile, color;
    private int width,length,height,battery;

    public Mobile(){
        this.manufacturerMobile = "nokia";
        this.color = "Màu xanh";
        this.width = 30;
        this.length = 60;
        this.height = 1;
        this.battery = 10;
    }

    public Mobile(String mobileCode) {
        this.mobileCode = mobileCode;
        this.manufacturerMobile = "nokia";
        this.color = "Màu xanh";
        this.width = 30;
        this.length = 60;
        this.height = 1;
        this.battery = 10;
    }

//    public Mobile(String manufacturerMobile) {
//        this.manufacturerMobile = manufacturerMobile;
//    }
    public Mobile(String manufacturerMobile,String color) {
        this.manufacturerMobile = manufacturerMobile;
        this.color = color;
    }
    public Mobile(String manufacturerMobile, String color, int width, int length, int height, int battery) {
        this.manufacturerMobile = manufacturerMobile;
        this.color = color;
        this.width = width;
        this.length = length;
        this.height = height;
        this.battery = battery;
    }

    public Mobile(String mobileCode, String manufacturerMobile, String color, int width, int length, int height, int battery) {
        this.mobileCode = mobileCode;
        this.manufacturerMobile = manufacturerMobile;
        this.color = color;
        this.width = width;
        this.length = length;
        this.height = height;
        this.battery = battery;
    }

    public String getMobileCode() {
        return mobileCode;
    }

    public void setMobileCode(String mobileCode) {
        this.mobileCode = mobileCode;
    }

    public String getManufacturerMobile() {
        return manufacturerMobile;
    }

    public void setManufacturerMobile(String manufacturerMobile) {
        this.manufacturerMobile = manufacturerMobile;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        if (battery <= 100 && battery >= 0){
            this.battery = battery;
        }
    }

    public String toString(){
        return
                "Mã: "  + this.getMobileCode() + "\n" +
                "Hãng sản xuất: "  + this.getManufacturerMobile() + "\n" +
                "Màu: "  + this.getColor() + "\n" +
                "Chiều rộng: "  + this.getWidth() + "\n" +
                "Chiều dài: "  + this.getLength() + "\n" +
                "Độ dày: "  + this.getHeight() + "\n"+
                "Pin: "  + this.getBattery() + "\n";
    }
    public String toStringList(){
        return
                "Mã: "  + this.getMobileCode() + " || " +
                "Hãng sản xuất: "  + this.getManufacturerMobile() + " || " +
                "Màu: "  + this.getColor() + " || " +
                "Chiều rộng: "  + this.getWidth() + " || " +
                "Chiều dài: "  + this.getLength() + " || " +
                "Độ dày: "  + this.getHeight() + " || "+
                "Pin: "  + this.getBattery();
    }


    public void display(){
        System.out.println(this.toString());
    }


}
