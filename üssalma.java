import java.util.Scanner;

public class üssalma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz :");
        int n = input.nextInt();

        int i;
        for(i = 1; i <= n; i *= 4) {
            System.out.println("4'un ussu " + i);
        }

        for(i = 1; i <= n; i *= 5) {
            System.out.println("5'in ussu " + i);
        }

    }
}
