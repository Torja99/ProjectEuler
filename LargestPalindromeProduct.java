public class LargestPalindromeProduct {
    public static void main(String[] args) {
        int factor = 0;
        String n = "";
        int max = 0;

        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                System.out.println("begin");
                System.out.println(j);
                factor = i * j;
                String t = Integer.toString(factor);
                n = rev(t);
                // break if factor is less than the max to avoid checking lower values
                if (factor <= max) {
                    break;

                }
                if (t.equals(n)) {
                    if (factor > max) {
                        max = factor;
                    }

                }

            }

        }
        System.out.println(max);

    }

    public static String rev(String f) {
        String n = "";
        for (int i = f.length() - 1; i >= 0; i--) {
            n = n + f.charAt(i);

        }
        return n;
    }

}
