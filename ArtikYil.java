import java.util.Scanner;
public class ArtikYil {

    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen yili giriniz :");
        yil = input.nextInt();
        if (yil % 400 == 0) {
            System.out.print("Bu yil artik bir yildir.");
        }
        else if(yil % 100 == 0){
            System.out.print("Bu bir artik yil degildir");
        }
        else{
            if(yil % 4 == 0){
                System.out.print("Bu bir artik yildir.");
            }
            else
                System.out.print("Degildir");
        }
    }
}
