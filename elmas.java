import java.util.Scanner;
public class elmas {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int n = obj.nextInt();
        int k = n;
        for(int i =1; i<=n; i++) {
            for (int j = k - 1; j > 0; j--) {
                System.out.print(" ");
            }
            k--;
            for (int a = 1; a <= (i * 2 - 1); a++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        k = 0;
        for(int l = n; l >=1; l--) {
            for (int c = 0; c<k; c++) {
                System.out.print(" ");
            }
            k++;
            for (int b = 1; b <= (l * 2 - 1); b++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}