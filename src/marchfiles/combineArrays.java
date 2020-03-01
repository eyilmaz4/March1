package marchfiles;

public class combineArrays {
    public static void main(String[] args) {
int []a={1,2,3};
int []b={4,5,6};
combineA(a,b); }
    public static void combineA(int[] a, int[] b) {
        int[] newArray = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            newArray[i]=newArray[i]+a[i];
            System.out.print(newArray[i]+"\t");
    }
               for (int i = 0; i < b.length; i++) {

            newArray[i+a.length] = newArray[i+a.length] + b[i];
            System.out.print(newArray[i+a.length]+"\t");
        }

    }
}
