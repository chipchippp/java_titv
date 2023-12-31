package java_37;



public class Main {
    public static void main(String[] args) {
        Date d1 = new Date(15, 4, 2004);
        Date d3 = new Date(15, 4, 2004);
        Date d2 = new Date(13, 12, 2006);

        LopHoc l1 = new LopHoc("10A1", "Lap trinh web");
        LopHoc l2 = new LopHoc("11A2", "Lap trinh KHMT");
        LopHoc l3 = new LopHoc("12A4", "Lap trinh AI");

        Student student1 = new Student(123, "nvl", d1, 7.7, l1);
        Student student2 = new Student(456, "lht", d2, 8.7, l2);
        Student student3 = new Student(789, "abc", d3, 3.1, l3);

        System.out.println("Tên khoa: ");
        System.out.println("St1: "+student1.tenKhoa());
        System.out.println("St2: "+student2.tenKhoa());
        System.out.println("St3: "+student3.tenKhoa());

        System.out.println("Kiểm tra có thi đạt: ");
        System.out.println("st1: " +student1.checkGpa());
        System.out.println("st2: " +student2.checkGpa());
        System.out.println("st3: " +student3.checkGpa());

        System.out.println("kiểm tra có trùng ngày sinh: ");
        System.out.println("st1 vs st2: " + student1.kiemTraCungNgaySinh(student2));
        System.out.println("st1 vs st3: " + student1.kiemTraCungNgaySinh(student3));


    }
}
