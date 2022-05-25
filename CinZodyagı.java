import java.util.Scanner;

public class CinZodyagı {

    public static void main(String[] args){
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Dogum yilinizi giriniz :");
        yil = input.nextInt();
        String[] burc = {"Maymun","Horoz","Köpek","Domuz","Fare","Öküz","Kaplan","Tavşan","Ejderha","Yılan","At","Koyun"};
        System.out.print(burc[yil%12]);
    }
}