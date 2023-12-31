package java_38;

public class Computer {
    private Manufacturer manufacturer;
    private Date date;
    private double price;
    private double thoiGianBaohanh;

    public Computer(Manufacturer manufacturer, Date date, double price, double thoiGianBaohanh) {
        this.manufacturer = manufacturer;
        this.date = date;
        this.price = price;
        this.thoiGianBaohanh = thoiGianBaohanh;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getThoiGianBaohanh() {
        return thoiGianBaohanh;
    }

    public void setThoiGianBaohanh(double thoiGianBaohanh) {
        this.thoiGianBaohanh = thoiGianBaohanh;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "manufacturer=" + manufacturer +
                ", date=" + date +
                ", price=" + price +
                ", thoiGianBaohanh=" + thoiGianBaohanh +
                '}';
    }
    public boolean checkPicethaphon(Computer computer){
        return this.price > computer.price;
    }
    public String nameCountry(){
        return this.manufacturer.nameCountry();
    }
}
