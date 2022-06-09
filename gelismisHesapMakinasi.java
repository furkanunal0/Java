import java.util.Scanner;

public class gelismisHesapMakinasi {

    static  int toplama(int sayi1,int sayi2){
        int result = sayi1+ sayi2;
        System.out.println("Toplam:" + result);

        return result;
    }
    static int cıkarma(int sayi1, int sayi2){
        int result = sayi1 - sayi2;
        System.out.println("Cikarma:" + result);

        return result;
    }

    static int carpma(int sayi1,int sayi2){
        int result = sayi1 * sayi2;
        System.out.println("Carpma:"+result);

        return result;
    }
    static int bolme(int sayi1,int sayi2){
        int result = sayi1 / sayi2;
        System.out.println("Bolme:"+ result);

        return result;
    }
    static int üsAlma(int sayi1,int sayi2){
        int result =1, dep = sayi1;
        for(int i = 1; i < sayi2; i++){
            sayi1 = dep * sayi1;
            result = sayi1;
        }
        System.out.println("Usuu:" + result);

        return result;
    }
    static int modAlma(int sayi1,int sayi2){
        int result = sayi1 % sayi1;
        System.out.println("Mod:" + result);

        return result;
    }
    static int CevreveAlan(int sayi1,int sayi2){
        int cevre = (sayi1+sayi1) + (sayi2 +sayi2);
        int alan= (sayi1 * sayi2);
        System.out.println("Cevre:"+ cevre);
        System.out.println("Alan:"+alan);
        return 0;
    }







    public static void main(String[] args){

        String menu = "Yapmak istediginiz islemi seciniz\n 1-Topmama\n 2-Cikarma\n 3-Carpma\n 4-Bolme\n 5-Us Alma\n 6-Mod Alma\n 7-Dikdortgen Alan ve Cevre Hesabi\n 0-Cikis\n";
        System.out.print(menu);
        while(true){
            int a,b,select;
            Scanner input = new Scanner(System.in);
            System.out.print("Yapmak istediginiz islemi seciniz:");
            select = input.nextInt();
            if(select == 0){
                break;
            }
            System.out.print("Lutfen 1.sayiyi giriniz:");
            a = input.nextInt();
            System.out.print("Lutfen 2.sayiyi giriniz:");
            b = input.nextInt();
            switch (select){
                case(1):
                    toplama(a,b);
                    break;
                case(2):
                    cıkarma(a,b);
                    break;
                case(3):
                    carpma(a,b);
                    break;
                case(4):
                    bolme(a,b);
                    break;
                case(5):
                    üsAlma(a,b);
                    break;
                case(6):
                    modAlma(a,b);
                    break;
                case(7):
                    CevreveAlan(a,b);
                    break;
            }






        }


    }

}
