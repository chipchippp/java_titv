package java_35;

public class Main {
    public static void main(String[] args) {
        Date d1 = new Date(15, 4, 2004);
        Date d2 = new Date(15, 4, 2004);
        Date d3 = new Date(13, 12, 2006);

        Author a = new Author("Nvl", d1);
        Author a3 = new Author("Lht", d3);
        Author a2 = new Author("Php", d2);


        Book b1 = new Book("Java", 150, 2030, a);
        Book b3 = new Book("C#", 200, 2030, a3);
        Book b2 = new Book("PHP", 100, 2100, a2);

        b1.bookName();
        b2.bookName();
        b3.bookName();

        System.out.println("ss b1 and b2: " + b1.publishingYear(b2));
        System.out.println("ss b1 and b3: " + b1.publishingYear(b3));

        System.out.println("after discount 10%: " + b1.discount(10));
        System.out.println("after discount 20%: " + b2.discount(20));
        System.out.println("after discount 30%: " + b3.discount(50));


    }
}
