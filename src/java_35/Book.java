package java_35;

public class Book {
    private String name;
    private double price;
    private int date;
    private Author author;

    public Book(String name, double price, int date, Author author) {
        this.name = name;
        this.price = price;
        this.date = date;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return
                "name = " + name + '\n' +
                "price = " + price + '\n' +
                "date = " + date + '\n' +
                "author = " + author;
    }

    public void bookName(){
        System.out.println(this.name);
    }
    public boolean publishingYear(Book otherBooks){
        return this.date == otherBooks.date;
    }

    public double discount(double x){
        return this.price*(1-x/100);
    }
}
