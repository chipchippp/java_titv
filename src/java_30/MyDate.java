package java_30;

public class MyDate {
    private int day, month,year;
    private String days;
    private String model;
    private double price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MyDate(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void printDay(){
        System.out.println("Day : " +this.day);
    }
    public void printMonth(){
        System.out.println("Month : " +this.month);
    }
    public void printYear(){
        System.out.println("Year : " +this.year);
    }
    public void printDate(){
        System.out.println("Date : " +this.day+"-"+this.month+"-"+this.year);
    }
}
