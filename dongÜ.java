import java.util.Scanner;

public class dongÜ {

public static void main(String [] args) {
    boolean v = true;
    Scanner input = new Scanner(System.in);
    int a,total = 0;
    while (v) {
        System.out.print("Bir sayi giriniz :");
        a = input.nextInt();
        if (a % 4 == 0) {
            total += a;
        }
        if(a % 2 == 1){
            v = false;
        }
    }
    System.out.print(total);
}
}


