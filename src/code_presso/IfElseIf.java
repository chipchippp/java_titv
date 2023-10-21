package code_presso;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so diem: ");
        n = sc.nextInt();

        if (n >= 90){
            System.out.println("A");
        } else if (n >= 80) {
            System.out.println("B");
        } else if (n >= 70) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }


        int disabilityGrade = 6;
        boolean isCompactCar = false;

        String discountTicket = "";
        String discountParking = "";


    }
}
