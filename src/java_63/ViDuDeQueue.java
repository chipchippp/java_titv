package java_63;

import java.util.ArrayDeque;
import java.util.Deque;


public class ViDuDeQueue {
    public static void main(String[] args) {
        Deque<String> danhSachSV = new ArrayDeque<>();

        danhSachSV.offer("TITV 1");
        danhSachSV.offer("Nguyen Van A");
        danhSachSV.offer("Nguyen Van B");
        danhSachSV.offer("TITV 2");
        danhSachSV.offerLast("TITV 4");
        danhSachSV.offerFirst("TITV 0");

        while(true) {
            String ten = danhSachSV.pollLast();  // => lấy ra và xóa
            if(ten==null) {
                break;
            }
            //peek => lấy ra nhưng không xóa.
            System.out.println(ten);
        }
    }
}
