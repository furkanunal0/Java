import java.io.OutputStream;
import java.util.Scanner;

public class Sinifgecme {

    public static void main(String[] args) {
        int Mat, Turkce, Fizik, Kimya, Muzik;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunu giriniz :");
        Mat = input.nextInt();
        System.out.print("Turkce notunu giriniz :");
        Turkce = input.nextInt();
        System.out.print("Fizik notunu giriniz :");
        Fizik = input.nextInt();
        System.out.print("Kimya notunuzu giriniz :");
        Kimya = input.nextInt();
        System.out.print("Muzik Notunuzu Giriniz :");
        Muzik = input.nextInt();

        int[] myIntArray = {Mat, Turkce, Fizik, Kimya, Muzik};
        int bolen = 5, toplam = Mat + Turkce + Fizik + Kimya + Muzik;
        for (int notlar: myIntArray) {
            if (notlar < 0 || notlar > 100) {
                toplam -= notlar;
                --bolen;
            }

        }
        int ortalama = toplam / bolen;
        if (ortalama >= 55) {
            System.out.print("Tebrikler sinifi gectiniz.");
        } else {
            System.out.println("Sinifta Kaldiniz.");
        }
        System.out.print("ortalamaniz :" +ortalama);
    }
}
