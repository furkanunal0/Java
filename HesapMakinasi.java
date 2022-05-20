import java.util.Scanner;
public class HesapMakinasi {

    public static void main(String[] args) {
        int n1, n2, bölme;
        Scanner input = new Scanner(System.in);
        System.out.print("ilk Sayiyi giriniz :");
        n1 = input.nextInt();
        System.out.print("ikinci Sayiyi giriniz :");
        n2 = input.nextInt();

        System.out.print("Hangi islemi yapmak istersiniz ? :");
        input.nextLine();
        String islem = input.nextLine();

        switch (islem) {
            case "-":
                System.out.print(n1 - n2);
                break;
            case "*":
                System.out.print(n1 * n2);
                break;
            case "+":
                System.out.print(n1 + n2);
                break;
            case "/":
                switch (n2){
                    case 0:
                        System.out.println("Bir sayi sifira bolunemez");
                        break;
                    default:
                        System.out.print(n1 / n2);
                }
                break;
            default:
                System.out.print("Yanlis veya Eksik bir islem girdiniz");

        }

    }
}
