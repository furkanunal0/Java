import java.util.Scanner;

public class BuyukKucuk {
    public static void main(String[] args){
        int a,sayac = 1,big = 0,small = 0,repo =0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz :");
        a = input.nextInt();
        for(int i = 1; i <= a; i++){
            System.out.print(sayac +".Sayi giriniz :");
            int b; b = input.nextInt();
            sayac++;
            if (sayac == 2){
             big = b;
             small = b;
            }
            if(b < small){
                small = b;
            }
            if(b > big){
                big = b;
            }
        }
            System.out.println(small);
            System.out.print(big);
    }

}

