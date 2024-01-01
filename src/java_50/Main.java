package java_50;

public class Main {
    public static void main(String[] args) {
        String s1 = "titv.vn";
        String s2 = "TITV.vn";
        String s3 = "titv.vn";

        // Hàm equals => so sánh 2 chuỗi giống nhau, có phân biệt Hoa Thường
        System.out.println("s1 equals s2: "+ s1.equals(s2));
        System.out.println("s1 equals s3: "+ s1.equals(s3));

        // Hàm equalsIgnoreCase, so sánh 2 chuỗi giống nhau, ko phân biệt hoa thường
        System.out.println("s1 equalsIgnoreCase s2: "+ s1.equalsIgnoreCase(s2));
        System.out.println("s1 equalsIgnoreCase s3: "+ s1.equalsIgnoreCase(s3));

        // Nếu các bạn só sánh tài khoản và mật khẩu của người khi đăng nhâp
        // Bạn sẽ dùng equals hoặc euqalsIgnoreCase?

        // Hàm compareTo => so sánh > < =
        String sv1 = "Nguyễn Văn A";
        String sv2 = "Nguyễn Văn B";
        String sv3 = "Nguyễn Văn ";
        String sv4 = "Nguyễn Văn a";

        System.out.println("sv1 compareTo sv2: "+ sv1.compareTo(sv2));
        System.out.println("sv1 compareTo sv3: "+ sv1.compareTo(sv3));
        System.out.println("sv1 compareTo sv4: "+ sv1.compareToIgnoreCase(sv4));

        // Hàm compareToIgnoreCase => Tường tự hàm compareTo, không biệt chữ hoa chữ thường

        String r1 = "NVL.vn";
        String r2 = "VL.v";
        String r3 = "vl.v";

        boolean check = r1.regionMatches(1, r2, 0 ,2);
        boolean check2 = r1.regionMatches(true, 1, r3, 0 ,2);

        System.out.println("r1 vs r2 "+check);
        System.out.println("r1 vs r3 "+check2);
        // 0937 456 789
        // 0937 455 765

        // Hàm startWith => Hàm kiểm tra chuỗi bắt đầu bằng ....
        String sdt = "038987653";
        System.out.println(sdt.startsWith("034"));
        System.out.println(sdt.startsWith("038"));

        // Hàm endWith => Hàm kiểm tra chuỗi kết thúc bằng ...
        String tenFile = "I love you.JPG";
        String tenFile2 = "Học Java.PDF";
        if (tenFile.endsWith("JPG")){
            System.out.println("File 1 là JPG!");
        } else if (tenFile.endsWith("PDF")) {
            System.out.println("File 1 là PDF!");
        }

        if (tenFile2.endsWith("JPG")){
            System.out.println("File 2 là JPG!");
        } else if (tenFile2.endsWith("PDF")) {
            System.out.println("File 2 là PDF!");
        }
    }
}
