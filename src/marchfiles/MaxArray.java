package marchfiles;

public class MaxArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 123, 44, 5, 6, 7, 8, 9, 10};
        System.out.println(findMAx(a));
    }

    static int findMAx(int[] a) {
       int max=a[0];
        for (int i = 0; i < a.length ; i++) {
                if (a[i]  > max) {
                   max=a[i];
                }
            }
        return max;
            }
        }

