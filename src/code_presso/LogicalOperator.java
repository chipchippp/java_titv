package code_presso;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
//        AND
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap x = ");
        x = sc.nextInt();
        System.out.println("nhap y = ");
        y = sc.nextInt();

        if (x >= 10 && y>= 10){
            System.out.println("AND TRUE");
        } else {
            System.out.println("AND Fail");
        }

//      OR
        if (x >= 10 || y>= 10){
            System.out.println("OR TRUE");
        } else {
            System.out.println("OR Fail");
        }

        // NOT
        boolean isDeviceReadyy = false;
        if (!isDeviceReadyy){
            System.out.println("Device is not ready");
        } else {
            System.out.println("Device is ready to pair");
        }

        boolean isBluetoothOn = false;
        boolean isWifiOn = true;
        boolean isDeviceReady;

        isDeviceReady = isBluetoothOn && isWifiOn;
        if (!isDeviceReady){
            System.out.println("Device id not");
        }
    }
}
