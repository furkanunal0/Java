import java.util.Scanner;
public class Armstrong {

    public static void main(String[] args){

        int number,digitcount = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi giriniz :");
        number = input.nextInt();
        int tempNumber = number,kontNumber = number,basValue,result = 0,basPow;
        while(number != 0){
            number = number / 10;
            digitcount++;
        }
        while (tempNumber != 0){
            basValue = tempNumber % 10;
           basPow = 1;
            for(int i = 1; i <= digitcount; i++){
               basPow = basPow * basValue;
            }
            result += basPow;
            tempNumber = tempNumber / 10;
        }
        System.out.println(result);
        if (result == kontNumber){
            System.out.println("Number sayisi bir armstrong sayidir.");
        }
        else{
            System.out.println("Bu sayi bir amstrong sayisi degildir");
        }
    }
}
