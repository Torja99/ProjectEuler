public class SmallestMultiple {
    public static void main(String[] args) {


        int i = 1;
        while (div(i) == false){
            i++;
        }
        System.out.println(i);
    }

    static boolean div(int a) {
        boolean flag = true;
        for (int i = 1; i <= 20; i++) {
            if (!(a % i == 0)) {
                flag = false;
                break;

            }

        }
        return flag;
    }

}
