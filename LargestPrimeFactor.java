import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class LargestPrimeFactor {
    public static void main(String[] args) {

        long target = 600851475143L;
        int factor = 2;

        while (target != 1) {
            if (target % factor == 0) {
                //trying to get to the smallest target for which there is a valid prime factor 
                target /= factor;
            } else {
                factor++;
            }
        }
        System.out.println(factor);
    }

}