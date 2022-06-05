import java.util.Scanner;

public class fibo {
    public  static void main(String[] args){
        int n,x= 0,f=0,n1 =1;
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci dizisinin eleman sayisini giriniz :");
        n = input.nextInt();
        for(int i = 1; i <= n; i++) {
            f = f + n1;
            n1 = n1 + f;

            System.out.println(f);
            System.out.println(n1);
        }
    }
}
