package java_62;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> stackChuoi = new Stack<>();
//        stackChuoi.push("gia tri ") => dua gia tri vao stack
//        stackChuoi.pop() => lay gia tri ra, xoa stack
//        stackChuoi.peek() => lay gtri ra nhung 0 xoa khoi stack
//        stackChuoi.clear(); => xoa all phan tu
//        stackChuoi.contains("giatri") => xac dinh gia tri co ton tai trong stack hay 0;
//        stackChuoi.size() => độ lớn của stack

//        ci du dao nguoc chuoi
        System.out.println("nhap vao chuoi: ");
        String s = sc.nextLine();
//        TITV
        for (int i =0; i<s.length(); i ++) {
            stackChuoi.push(s.charAt(i)+"");
        }
        System.out.println("chuoi dao nguoc: "+s);

        for (int i =0; i<s.length(); i ++) {
            System.out.print(stackChuoi.pop());
        }
        System.out.println(" ");

        Stack<Integer> stackSoDu = new Stack<Integer>();
        System.out.println("Nhập 1 số nguyên dương từ bàn phím: ");
        int x = sc.nextInt();
        while (x>0){
            int soDu = x % 2;
            stackSoDu.push(soDu);
            x = x/2;
        }
        System.out.println("Số nhị phân là: ");
        int n = stackSoDu.size();
        for (int i = 0; i<n; i++){
            System.out.print(stackSoDu.pop());
        }
    }
}
