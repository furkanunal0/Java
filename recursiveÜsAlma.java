import java.util.Scanner;
public class recursiveÜsAlma {

 static int üsalma(int a, int b){
     int result = 1, dep = a;
        for(int i = 1; i < b; i++){
            dep = a * dep;
            result = dep;
        }
    return result;
 }

static int pow(int number,int exponent){
     if (exponent == 1) {
         return number;
     }
     return number * (pow(number,exponent -1));
 }



 public static void main(String[] args){
     int taban,üs;

     Scanner input = new Scanner(System.in);
     System.out.print("taban :");
    taban = input.nextInt();
    System.out.print("us :");
    üs = input.nextInt();
    System.out.println(pow(taban,üs));

 }
}
