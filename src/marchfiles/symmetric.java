package marchfiles;

public class symmetric {
    public static void main(String[] args) {
        int[] a = {1,2,3,2,1};
        Symm(a);
    }

    public static void Symm(int[] a) {

        int index=a.length-1;
        int counter=0;
        for (int i = 0; i <a.length; i++) {
            if ((a[i] != a[index])) {
                counter++;

            }index--;
        }
        if(counter==0){
            System.out.println("Symmetric");
                           }
        else{
            System.out.println("not symmetric");
        }

        }
    }

