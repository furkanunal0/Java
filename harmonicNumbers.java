import java.util.Scanner;

    public class harmonicNumbers {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int a;
            System.out.print("Lutfen bir sayi giriniz :");
            a = input.nextInt();
            double result = 0;
            // for döngüsündeki değeri double yaparsak da double değer alırız.
            for (int i = 1; i <= a; i++){
                result += (1.0/i);
            }
            System.out.println(result);
        }

}
// Double / int = double.
// İnt / int = int.