package marchfiles;
import java.util.Scanner;
public class first {
    public static void main(String[] args) {
          System.out.println("First half:");
        int [] a={1,2,3,4,5,6,7,8,9};
        int newlength=0;
        int length=(a.length)/2;
        if(length%2==0){
            newlength=length;
        }        else {
            newlength = (int) length;
        }
        for(int i=0; i<newlength; i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        System.out.print("2nd half:");
        System.out.println();
        for(int i=newlength; i<a.length; i++){
            System.out.print(a[i]+"\t");
        }

    }
}
