import java.util.Scanner;
public class sss {
    public static void main(String[] args) {
        System.out.println("Lütfen sayıyı girin.");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Girdiğiniz sayı: "+number);
        System.out.print("Çıktısı : ");
        desen(number,number,number);
        input.close();
    }
    static void desen(int a,int b,int c)
    {
        if (a>0)
        {
            System.out.print(a+" ");
            a =a-5;
            c=a;
            desen(a,b,c);
        }
        else if(a <=0)
        {
            System.out.print(c +" ");
            c=c+5;
            if (b ==c)
            {
                System.out.println(b);
            }
            else
            {
                desen(a,b,c);

            }
        }
    }
}
