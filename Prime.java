
public class Prime {
    public static void main(String[] args) {

        int place = 10001;
        int j = 2; 
        int i = 0; // only increases if prime number is found
        while (i < place) {
            if (isPrime(j)) {
                i++;
            }
            j++;
        }
        System.out.println("Place: " + place + " prime number: " + j);

    }

    public static boolean isPrime(int a) {
        // go to sqrt of a as anything larger would have been tested through the smaller
        // factors
        int i = 2;
        while (i <= Math.sqrt(a)) {
            if (a % i == 0) {
                return false;

            }
            i++;
        }
        return true;
    }

}
