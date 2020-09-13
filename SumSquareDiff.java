public class SumSquareDiff {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        
        // sum of square of first 100 hundred
        for (int i = 1; i <= 100; i++) {
            sum1 += Math.pow(i, 2);

        }

        // square sum of first 100
        for (int i = 1; i <= 100; i++) {
            sum2 += i;

        }
        sum2 = (int) Math.pow(sum2, 2);

        System.out.println(sum2 - sum1);

    }
}
