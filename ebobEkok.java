import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        int n,n1,ebob= 1;
        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayiyi giriniz :");
        n = input.nextInt();
        System.out.print("ikinci sayiyi giriniz :");
        n1 = input.nextInt();
        int a1 = n ,a2 = n1,ekok = 1;
        for(int b = 1; b <= (a1 * a2); b++){
            if(b % a1 == 0 && b % a2 == 0){
                ekok = b;
            }
        }
        System.out.println("ekok :" + ekok);

        for(int i =1 ; i<= n; i++){
                if(n % i == 0 && n1 % i == 0){
                    ebob = i;
                }
            }
            System.out.println("ebob :" + ebob);
    }

}
