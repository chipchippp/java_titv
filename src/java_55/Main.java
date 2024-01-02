package java_55;

import java.util.Arrays;

public class Main {
    public static int[] reverse(int[] x){
        int[]result = new int[x.length];
        int index =0;
        for (int i = x.length-1; i > 0; i--){
            result[index]=x[i];
            index++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a = new int[]{1,8 ,4,3,2,7,9};
        int [] b = new int[15];

        //
        System.out.println("a ban dau: "+Arrays.toString(a));
        //ham sap xep tang dan
        Arrays.sort(a);
        System.out.println("a sau khi sap xep: "+Arrays.toString(a));

        //ham search
        int resultSearch ;
        System.out.println( Arrays.binarySearch(a,4));
        System.out.println( Arrays.binarySearch(a,-1));

        //ham dien gia tri
        Arrays.fill(b,5);
        System.out.println("b sau khi dien gtri: "+Arrays.toString(b));

        //ham sap xep giam dan
        Arrays.sort(a);
        a = Main.reverse(a);
        System.out.println("a sau khi sap xep giam dan: "+Arrays.toString(a));

    }
}
