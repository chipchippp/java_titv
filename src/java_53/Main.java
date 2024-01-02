package java_53;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // kiểu nguyên thủy
        int[] mang1 = {1,2,3};

        // copy mang cach 1
        int[] mang1_a = mang1;
        mang1_a[0] = 100;
        System.out.println("mang 1"+Arrays.toString(mang1));
        System.out.println("mang 1_a"+Arrays.toString(mang1_a));

        // copy mang cach 2- dung ham clone
        int[] mang1_b = mang1.clone();
        mang1_b[0] = 50;
        System.out.println("Mảng 1_b: " + Arrays.toString(mang1_b));

        // copy mang cach 3- dung ham arrayCopy
        int[] mang1_c = new  int[mang1.length];
        System.arraycopy(mang1, 0 , mang1_c, 0, mang1.length);
        mang1_a[0] = 90;
        System.out.println("Mảng 1_c: " + Arrays.toString(mang1_c));

        // Kiểu đối tượng
        String[] mang_doi_tuong = {"NVL", ".vn"};

        //cach 1
        String[] mang_dt = mang_doi_tuong;
        mang_dt[0] = "nvl";
        System.out.println("mang_doi_tuong "+ Arrays.toString(mang_doi_tuong));
        System.out.println("mang_dt "+ Arrays.toString(mang_dt));

        // cach 2
        String[] mang_dt2 = mang_doi_tuong.clone();
        mang_dt2 [0] = "Nvl";
        System.out.println("mang_dt2 "+ Arrays.toString(mang_dt2));

        // cach 3
        String[] mang_dt3 = new String[mang_doi_tuong.length];
        System.arraycopy(mang_doi_tuong, 0, mang_dt3, 0, mang_doi_tuong.length);
        mang_dt3[0] = "hihi";
        System.out.println(Arrays.toString(mang_dt3));
    }
}
