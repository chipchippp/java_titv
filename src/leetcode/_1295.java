package leetcode;

public class _1295 {
    public static int findNumbers(int[] nums) {
        int bienDem = 0;

        for (int a : nums){
//            ktra so chu so cua a
//            neu chu so la chan => tang bien dem len 1
            int soLuongChuSo = tinhSoChuSo(a);
            if (soLuongChuSo % 2 == 0){
                bienDem++;
            }
        }

        return bienDem;
    }

    private static int tinhSoChuSo(int a){
        int biemDem = 0;
        int kq = a;
        while (kq != 0){
            kq = a / 10;
            a = kq;
            biemDem++;
        }
        return biemDem;
    }

    public static void main(String[] args) {

        int[] nums = {1, 222, 33, 4444};
//        int[] n2 = new int[4];

        System.out.println(findNumbers(nums));
//       System.out.println(tinhSoChuSo(123));
//        System.out.println(tinhSoChuSo(22));

//        n2[0] = 4; // = 4 - 0 | n2.length - i
//        n2[1] = 3; // = 4 - 1 | n2.length - i
//        n2[2] = 2; // = 4 - 2 | n2.length - i
//        n2[3] = 1; // = 4 - 3 | n2.length - i

//        for (int i = 0; i < n2.length; i++) {
//            n2[i] = n2.length - i;
//        }
//
//        for (int ai : n2){
//            System.out.println("ai = "+ai);
//        }

//        for (int i = 0; i < nums.length; i++){
//            System.out.println(i+". a[i] = " + nums[i]);
//        }
    }
}
