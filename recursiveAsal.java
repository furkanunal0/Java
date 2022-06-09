public class recursiveAsal{
        public static boolean recursivePrime(int i , int primeNumber){
            if(primeNumber % i == 0 && primeNumber != 2){ // eğer rakam 2'ye bölünüyorsa(recursive oldugu için i artıyor 3,4,5vs.) ve 2 değilse asal değildir.
                return false;
            }
            else{
                if (i >= primeNumber-1){    //-1 diyoruz cünkü sayi zaten kendisine bölündüğü için true olmasını istemiyoruz
                    return true;
                }
                return recursivePrime(++i, primeNumber); //recursive islemi burada gerceklesiyor.
            }
        }
        public static void main(String[] args) {
            System.out.println(recursivePrime(2,11));
        }
    }