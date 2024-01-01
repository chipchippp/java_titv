package java_46;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test câu a: ");
        Casio500 casio500 = new Casio500();
        VinaCal500 vinaCal500 = new VinaCal500();

        System.out.println("5 + 5 = "+ casio500.cong(5,5));
        System.out.println("5 - 5 = "+ casio500.tru(5,5));
        System.out.println("5 * 5 = "+ vinaCal500.nhan(5,5));
        System.out.println("5 / 0 = "+ vinaCal500.chia(5,0));

        System.out.println("Test câu b: ");
        double [] arr = new double[]{3,4,9,1,5,6,8,0};
        double [] arr2 = new double[]{6,3,9,2,5,7,1,0};
        InsertionSort insertionSort = new InsertionSort();
        SortSelect sortSelect = new SortSelect();

        insertionSort.sapXepTang(arr);
        for (int i = 0; i < arr.length; i++){
//            double d = arr[i];
            System.out.print(arr[i]+ " ");
        }
        System.out.println(" ");
        sortSelect.sapXepGiam(arr2);
        for (int i = 0; i < arr2.length; i++){
//            double d = arr2[i];
            System.out.print(arr2[i]+ " ");
        }

        System.out.println("Test cau c: ");
        Software software = new Software();
        System.out.println("5 + 5 = "+ software.cong(5,5));
        System.out.println("5 - 5 = "+ software.tru(5,5));
        System.out.println("5 * 5 = "+ software.nhan(5,5));

        double [] arr3 = new double[]{6,3,9,2,5,7,1,0};
        software.sapXepTang(arr3);
        for (int i = 0; i < arr3.length; i++){
//            double d = arr[i];
            System.out.print(arr3[i]+ " ");
        }
    }
}
