package marchfiles;

public class minArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 123, 44, 5, 6, 7, 8,0, 9, 10};
        System.out.println(findMin(a));
    }

    static int findMin(int[] a) {
        int min=a[0];
        for (int i = 0; i < a.length ; i++) {
            if (a[i]  < min) {
                min=a[i];
            }
        }
        return min;
    }
}



