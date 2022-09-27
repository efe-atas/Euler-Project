import java.math.MathContext;
import java.util.PrimitiveIterator;

public class QS7 {

    static boolean isPrime(int x) {

        int k = 0;

        if (x != 2) {

            for (int j = 2; j <= Math.sqrt(x); j++) {

                if (x % j == 0) {
                    k++;
                    return false;

                }
            }
        }

        if (k == 0 || x == 2) {
            return true;

        }

        return true;
    }

    public static void main(String[] args) {

        int count = 0;

        for (int i = 2; i < 999999999; i++) {
            if (isPrime(i) == true) {
                count++;

            }

            if (count == 10001) {
                System.out.println(i);
                break;

            }

        }

    }

}
