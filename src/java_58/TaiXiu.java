package java_58;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
 * Một người chơi sẽ có tài khoản. Người chơi có quyền đặt cược số tiền ít hơn hoặc bằng
 * số tiền họ đang có.
 * Luật chơi như sau:
 * Có 3 viên xúc xắc. Mõi viên xúc có 6 mặt có giá tị từ 1 đến 6.
 * Mỗi lần lắc sẽ ra một kết quả. Kết quả = giá trị xx1 + giá trị xx2 + giá xx3
 * 1. Nếu tổng = 3 hoặc 18 => Cái ăn hết, người chơi thua.
 * 2. Nếu tổng = (4->10) <-> xỉu => nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua
 * 3. Nếu tổng = (11-17) <-> tài => nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua
 */
public class TaiXiu {
    public static void main(String[] args) {
        double accountUser = 50000.99;
        Scanner sc = new Scanner(System.in);

        Locale lc = new Locale("en", "US");
//        NumberFormat nf = NumberFormat.getInstance(lc);
        NumberFormat nf = NumberFormat.getCurrencyInstance(lc);

        int luaChon = 0;
        do {
            System.out.println("----------Mời bạn lựa chọn-----------");
            System.out.println("Chọn (1) để tiếp tục chơi.");
            System.out.println("Chọn (phím kỳ) để tiếp thoát.");
            luaChon = sc.nextInt();
            if (luaChon == 1){
                System.out.println("*** BẮT ĐẦU CHƠI: ");
                // đặt cược
                System.out.println("**** Tài khoản của bạn "+nf.format(accountUser)+" bạn muốn cược bao nhiêu?");
                double datCuoc = 0;
                do {
                    System.out.println("******* Đặt cược 0 < số tiền cược => " +nf.format(accountUser)+":");
                    datCuoc = sc.nextDouble();

                }while (datCuoc <= 0 || datCuoc>accountUser);

                // CHọn tài xỉu
                int luaChonTaiXiu = 0;
                do {
                    System.out.println("*******Chọn: 1 <-> Tài hoặc 2 <-> Xỉu ");
                    luaChonTaiXiu = sc.nextInt();
                }while (luaChonTaiXiu!=1 && luaChonTaiXiu!=2);

                // Tung xúc xắc
                Random xucXac1 = new Random();
                Random xucXac2 = new Random();
                Random xucXac3 = new Random();

                int giaTri = xucXac1.nextInt(5)+1;
                int giaTri2 = xucXac2.nextInt(5)+1;
                int giaTri3 = xucXac3.nextInt(5)+1;

                int tong = giaTri+giaTri2+giaTri3;

                //Tinh toan ket qua
                System.out.println("Kết quả: "+giaTri+" - "+giaTri2+" - "+giaTri3);
                if (tong==3 || tong==18){
                    accountUser-=datCuoc;
                    System.out.println("*** Tổng là: "+tong+ "Nhà cái ăn hết bạn đã thua!");
                    System.out.println("Your account is: "+nf.format(accountUser));
                } else if (tong>=4 || tong<=10) {
                    System.out.println("*** Tổng là: "+tong+ "=> Xỉu");
                    if (luaChonTaiXiu==2){
                        accountUser+=datCuoc;
                        System.out.println("Bạn đã win !");
                        System.out.println("Your account is: "+nf.format(accountUser));
                    }else {
                        accountUser-=datCuoc;
                        System.out.println("Bạn đã lose !");
                        System.out.println("Your account is: "+nf.format(accountUser));
                    }
               } else {
                    System.out.println("*** Tổng là: "+tong+ "=> Tài");
                    if (luaChonTaiXiu==1){
                        accountUser+=datCuoc;
                        System.out.println("Bạn đã win !");
                        System.out.println("Your account is: "+nf.format(accountUser));
                    }else {
                        accountUser-=datCuoc;
                        System.out.println("Bạn đã lose !");
                        System.out.println("Your account is: "+nf.format(accountUser));
                    }
                }
            }
        }while (luaChon==1);
    }
}
