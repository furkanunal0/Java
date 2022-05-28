import java.util.Scanner;


    public class faktoryel {
        public static void main(String[] args){
            int c,n,r,z,f,totaln = 1,totalr = 1,totalz =1;
            Scanner input = new Scanner(System.in);
            System.out.print("Birinci sayiyi giriniz :");
            n = input.nextInt();
            System.out.print("Ikinci sayiyi giriniz :");
            r = input.nextInt();
            z = (n-r);
            for(int i = 1; i <= n; i++){
                totaln = totaln * i;
            }
            for(int a = 1; a <= r; a++){
                totalr = totalr * a;
            }
            for(int b = 1; b <= z; b++){
                totalz = totalz * b;
            }
            System.out.println(totaln);
            System.out.println(totalr);
            c = totaln / (totalr * totalz);
            System.out.println("kombinasyon:" + c);


        }

    }
