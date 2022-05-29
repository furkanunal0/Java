import java.util.Scanner;
    public class ATM {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;

        while(right > 0) {
            System.out.print("Lutfen adinizi giriniz :");
            String userName = input.nextLine();
            System.out.print("Lutfen sifrenizi giriniz :");
            String userPassword = input.nextLine();
            if (userName.equals("ibrahim") && userPassword.equals("12345")) {
                System.out.println("Sisteme giris yaptiniz.");

                int selecet;
                do {
                    System.out.println("1- Para yatirma islemi\n2- Para cekme\n3- Bakiye sorgulama\n4- Cikis");
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz :");
                    selecet = input.nextInt();
                    int money;
                    if (selecet == 1) {
                        System.out.print("Yatiracaginiz miktari giriniz :");
                        money = input.nextInt();
                        balance += money;
                    } else if (selecet == 2) {
                        System.out.print("Cekmek istediginiz miktari giriniz:");
                        money = input.nextInt();
                        if (balance > money) {
                            System.out.println("Bakiyeniz yetersiz.");
                        } else {
                            balance -= money;
                        }
                    } else if (selecet == 3) {
                        System.out.println("Bakiyeniz :" + balance);
                    }
                } while(selecet != 4);

                return;
            }

            --right;
            System.out.println("isminiz veya sifreniz hatali.");
            System.out.println("Kalan hakkiniz :" + right);
            if (right == 0) {
                System.out.println("Hesabiniz bloke edilmistir.");
            }
        }

    }
}