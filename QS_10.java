public class QS10 {

    static boolean isPrime(int x) {

        if (x == 2) {
            return true;
        } else {

            for (int i = 2; i <= Math.sqrt(x); i++) {

                if (x % i == 0) {
                    return false;

                }
            }
        }

        return true;

    }

    public static void main(String[] args) {
        long k = 0;
        for (int j = 2; j <= 2000000; j++) {

            if (isPrime(j)) {
                System.out.println(j);
                k += j;
            }

        }
        System.out.println(k);

    }

}
