package java_38;




public class Main {
    public static void main(String[] args) {
        Date d1 = new Date(15, 4, 2004);
        Date d3 = new Date(15, 4, 2004);
        Date d2 = new Date(13, 12, 2006);

        Country country1 = new Country("123", "VN");
        Country country2 = new Country("345", "Japan");
        Country country3 = new Country("456", "US");

        Manufacturer m1 = new Manufacturer("Nvl", country1);
        Manufacturer m2 = new Manufacturer("Lht", country2);
        Manufacturer m3 = new Manufacturer("LBC", country3);

        Computer computer1 = new Computer(m1, d1, 1000, 2021);
        Computer computer2 = new Computer(m2, d2, 1500, 2022);
        Computer computer3 = new Computer(m3, d3, 2000, 2023);

        System.out.println("so sanh c1 vs c2: " + computer1.checkPicethaphon(computer2));
        System.out.println("so sanh c3 vs c1: " + computer3.checkPicethaphon(computer1));

        System.out.println("Tên quốc gia: ");
        System.out.println("M1: "+ computer1.nameCountry());
        System.out.println("M2: "+ computer2.nameCountry());
        System.out.println("M3: "+ computer3.nameCountry());

    }
}
