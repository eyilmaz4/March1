package marchfiles;

public class commonArray {
    public static void main(String[] args) {
   int [] a={1,2,3, 4, 5, 6, 7, 8, 9};
   int [] b={5, 7, 12, 4, 55, 67, 99};
        commonArrays( a,b);
    }

    public static void commonArrays(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i]);
                }
            }
        }
    }
}
