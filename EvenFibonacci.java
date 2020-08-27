public class EvenFibonacci {
    public static void main(String[] args) {
        // 1,2,3,5,8,13
        // find sum of all even numbers for fib numbers under 4000000

        int back2 = 1;
        int back1 = 2;
        int newFib = 0;
        int sum = 2;

        while (newFib < 4000000) {
            newFib = back1 + back2;
            back2 = back1;
            if (newFib % 2 == 0) {
                sum += newFib;
            }
            back1 = newFib;

        }
        System.out.println(sum);
    }
}