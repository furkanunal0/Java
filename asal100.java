public class asal100 {
    public static void main(String[] args) {
        int counter = 0;
        for(int i =2; i <= 100; i++){
            for(int j = 2; j <= i/2; j++){
                if(i % j == 0){
                    counter++;
                }
            }
            if(counter == 0){
                System.out.println(i);
            }
            counter = 0;
        }
    }
}