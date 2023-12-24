package java_36;

public class Main {
    public static void main(String[] args) {
        Date d1 = new Date(15, 4, 2004);
        Date d2 = new Date(15, 4, 2004);
        Date d3 = new Date(13, 12, 2006);

        Manufacturer m1 = new Manufacturer("Nvl", "VN");
        Manufacturer m2 = new Manufacturer("Lht", "Japan");
        Manufacturer m3 = new Manufacturer("LBC", "US");


        Movie movie1 = new Movie("Java", 2002, m1, 100, d1);
        Movie movie2 = new Movie("Spring", 2002, m2, 150, d2);
        Movie movie3 = new Movie("Php", 2004, m3, 90, d3);

        System.out.println("ss movie1 and movie2 : " + movie1.checkPrice(movie2));
        System.out.println("ss movie1 and movie3 : " + movie1.checkPrice(movie3));


        movie1.manufacturerName();
        movie2.manufacturerName();
        movie3.manufacturerName();

        System.out.println("after discount 10%: " + movie1.discount(10));
        System.out.println("after discount 20%: " + movie2.discount(20));
        System.out.println("after discount 50%: " + movie3.discount(50));

    }
}
