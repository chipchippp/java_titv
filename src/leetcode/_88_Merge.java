package leetcode;

public class _88_Merge {
    public void merge(int[] n1, int m, int[] n2, int n) {
        for (int ai : n2){
            chenPhanTuVaoMang(ai, n1, m);
            m++;
        }

    }

    private void chenPhanTuVaoMang(int ai, int[] n1, int m) {

    }

    public static void main(String[] args) {

    }
}
