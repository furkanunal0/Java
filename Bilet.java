import java.util.Scanner;
public class Bilet {

    public static void main(String[] args){
        int yas,tip,y;
        double km;
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Km cinsi uzerinden ne kadar mesafe kat ettiginizi yaziniz :");
        km = input.nextInt();
        System.out.print("Lutfen yasinizi giriniz :");
        yas = input.nextInt();
        System.out.print("1- Tek Yon \n2- Gidis Donus \nLutfen seyehat tipini seciniz :");
        tip = input.nextInt();
        if(km <= 0 && tip != 1 && tip != 2){
            System.out.print("Hatali giris yaptiniz");
        }
        km = km * 0.10;
        if(yas <= 0 || yas >= 110){
          System.out.print("Hatali giris yaptiniz.");
        }
        if(yas < 12){
            km /= 2;
        }
        if(yas > 12 && yas < 24){
            km = km * 9;
            km /= 10;
        }
        if(yas > 65){
            km = km * 7;
            km /= 10;
        }
        if(tip == 2){
            km = km * 8;
            km /= 10;
        }


        System.out.print("Toplam tutar:"+ km +" TL");
    }
}
