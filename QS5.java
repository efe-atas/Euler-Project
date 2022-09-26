public class QS5 {
    public static void main(String[] args) {

        int k = 0;

        for (int i = 2520; i <= 999999999; i++) {

            for (int j = 1; j <= 20; j++) {

                if (i % j == 0) {

                    k++;

                }

            }
            if (k == 20) {
                System.out.println(i);
                break;

            }

            if (k != 20) {
                k = 0;
            }

        }

    }
}
