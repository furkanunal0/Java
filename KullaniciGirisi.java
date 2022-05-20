import java.util.Scanner;


public class KullaniciGirisi {

        public static void main(String[] args){
            String ad,sifre,yenisifre,kont;

            Scanner input = new Scanner (System.in);

            System.out.print("Lutfen adinizi giriniz :");
            ad = input.nextLine();
            System.out.print("Lutfen sifrenizi giriniz :");
            sifre = input.nextLine();

            if(ad.equals("ibrahim") && sifre.equals("12345")) {
                System.out.println("Giris yaptiniz");
            }
            else if (!((ad.equals("ibrahim") || sifre.equals("12345")))){
                System.out.print("ismi ve Sifreyi Hatali Girdiniz.");
            }
                else if(!ad.equals("ibrahim")) {

                System.out.println("Yanlis isim girdiniz.");
            }
                 else if(!sifre.equals("12345")){

                         System.out.println("Yanlis Sifre girdiniz.\n Sifrenizi sifirlamak ister misiniz (Y) / (N) ?");
                    kont = input.nextLine();
                    switch (kont){
                        case "Y":
                            System.out.print("Yeni sifrenizi giriniz :");
                            yenisifre = input.nextLine();
                            if (yenisifre.equals("12345")){
                                System.out.print("Sifre olusturalamadi lutfen baska bir sifre giriniz.");
                            }
                            else if (!yenisifre.equals("12345"))
                                System.out.print("Sifre olusturuldu");
                            break;
                        case "N":
                            System.out.println("Cikis yaptiniz.");
                            break;
                    }

                 }

                }

            }



