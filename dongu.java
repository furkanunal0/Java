import java.util.Scanner;

public class dongu {
    public static void main(String[] args) {

        int password;
        boolean isPasswordSucces = true;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sifre giriniz :");
            password = input.nextInt();
            if(password == 123){
                System.out.print("dogru");
                isPasswordSucces = false;
            }
        else{
            System.out.print("Yanlis\n");
            }
        }
        while (isPasswordSucces);








    }
}


