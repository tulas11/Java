public class PrimeNumbers {

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimes(int n) {
        for (int num = 2; num <= n; num++) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
        printPrimes(20);
    }
}
