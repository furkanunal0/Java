import java.util.Scanner;

public class üsal {

    public static void main(String[] args){
        int a,b,total = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("sayi :");
        a = input.nextInt();
        System.out.print("ussu :");
        b = input.nextInt();

        for(int i = 1; i <= b; ++i){
            total = total * a;
        }
        System.out.println(total);
    }
}