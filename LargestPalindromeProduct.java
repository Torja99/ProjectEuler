public class LargestPalindromeProduct {
    public static void main(String[] args) {
        int factor = 0;
        String n ="";
        int max = 0;


        for (int i = 900; i <= 999; i++) {
            for (int j = 900; j <= 999; j++) {
                factor = i * j;
                String t = Integer.toString(factor);
                n = rev(t);
                if (t.equals(n)) {
                  System.out.println("Pot palinddrome: " + factor + "From factors: " + i + ", " + j);
                    if (factor > max) {
                        max = factor;
                    }


                }

            }

        }
       System.out.println(max);

    }

    public static String rev (String f) {
        String n = "";
        for (int i = f.length()-1; i >= 0; i--) {
            n = n + f.charAt(i);
            
            
        }
        return n;
    }

}
