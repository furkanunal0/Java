import java.util.Scanner;

public class Siralama {

    public static void main(String[] args){

        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayiyi giriniz :");
        a = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz :");
        b = input.nextInt();
        System.out.print("Ucuncu sayiyi giriniz :");
        c = input.nextInt();
        if((a < c) && (a < b)) {

            if(b < c){

                System.out.print("a < b < c");

            }
            else{
                System.out.print("a < c < b");
            }
        }
            else if ((b < c) && (b <a)){

                if(a < c){
                    System.out.print("b < a < c");
                }
                else{
                    System.out.print("b < c < a");
                }

            }
            else if ((c < a) && (c < b)){
                if (a < b){
                    System.out.print("c < a < b");
                }
            else{
                System.out.print("c < b < a");
                }
            }

    }

}

