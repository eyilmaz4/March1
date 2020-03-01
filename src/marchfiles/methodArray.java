package marchfiles;

public class methodArray {
    public static void main(String[] args) {
        randomArray(5);
    }
    public static void randomArray(int numberOfArray){
              int [] newArray= new int[numberOfArray];
        for(int i=0; i< newArray.length; i++){
           // newArray[i]=(1000+(int)(Math.random()*4000));
            newArray[i]=(10+(int)(Math.random()*40));
         //   if(newArray[i]==newArray[i+1]){


            System.out.print(newArray[i]+"\t");
        }

    }
}