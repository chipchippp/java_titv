package java_36;


public class Movie {
    private String name;
    private int year;
    private Manufacturer manufacturer;
    private double price;
    private Date date;

    public Movie(String name, int year, Manufacturer manufacturer, double price, Date date) {
        this.name = name;
        this.year = year;
        this.manufacturer = manufacturer;
        this.price = price;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return
                "name = " + name + '\n' +
                "year = " + year + '\n' +
                "manufacturer = " + manufacturer + '\n' +
                "price = " + price + '\n' +
                "date = " + date;
    }

    public boolean checkPrice(Movie movie){
        return this.price < movie.price;
    }

    public void manufacturerName(){
        System.out.println(name);
    }

    public double discount(double x){
        return this.price*(1-x/100);
    }
}
