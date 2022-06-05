import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args){
        int a,b=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz :");
        a = input.nextInt();
        for(int i =1;  i<=a/2 ; i++){ //Kodun hızlanmasi icin i<=a/2 yapildi cünkü bir sayinin yarisindan fazlası ile o sayi bölünürse kalansız bir sonuç elde edilemez.
            if(a % i == 0){
                b = b + i;
            }
        }
        if(b == a){
            System.out.print("Bu sayi mukemmel bir sayidir.");
        }
        else{
            System.out.print("Bu sayi mukemmel degildir.");
        }
    }
}
