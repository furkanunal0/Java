import java.util.Scanner;


public class s {

    public static void main(String[] args) {

        int k, bolen = 0,toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen sayi giriniz :");
        k = input.nextInt();

        for (int i = 0; i <= k; i++) {
              if(i % 3 == 0 && i % 4 == 0){
                  toplam += i;
                  bolen++;
              }
            }
            System.out.print(toplam/bolen);
    }

    }


