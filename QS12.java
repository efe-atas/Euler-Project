public class QS12 {

    public static int tri(int x) {
        int a = 0;

        for (int i = 0; i <= x; i++) {

            a += i;
        }

        return a;

    }

    public static int divisor(int x) {

        int k = 0;
        for (int i = 1; i < Math.sqrt(x) + 1; i++) {

            if (x % i == 0) {
                k++;
            }

        }

        return 2 * k;

    }

    public static void main(String[] args) {

        for (int n = 1; n < 99999999; n++) {

            if (divisor(tri(n)) >= 500) {
                System.out.println(tri(n));
                break;

            }

        }

    }

}
