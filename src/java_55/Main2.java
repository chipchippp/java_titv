package java_55;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        Student sv1 =new Student(150, "Tran Van Thanh", "Lop 1", 9);
        Student sv2 =new Student(100, "Nguyen Thi Thanh Hoa", "Lop 2", 8);
        Student sv3 =new Student(199, "Nguyen Van An", "Lop 2", 8);
        Student sv4 =new Student(199, "Nguyen Van Binh", "Lop 2", 8);

        Student[] a_sv = new Student[]{sv1, sv2, sv3};

        System.out.println("ban dau: "+ Arrays.toString(a_sv));
        // ham sap xep
        Arrays.sort(a_sv);
        System.out.println("sau khi: "+ Arrays.toString(a_sv));

        System.out.println("Tìm kiếm An: "+ Arrays.binarySearch(a_sv, sv1));
        System.out.println("Tìm kiếm Binh: "+ Arrays.binarySearch(a_sv, sv4));

    }
}
