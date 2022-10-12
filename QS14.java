public class QS14 {

    public static void main(String[] args) {

        long max = 0;
        int ans = 0;

        long num = 0;

        for (int i = 2; i <= 1000000; i++) {
            long step = 0;

            num = i;

            while (num != 1) {

                if (num % 2 == 0) {
                    num = num / 2;

                }

                else {
                    num = (3 * num) + 1;

                }
                step++;
            }

            if (step > max) {

                max = step;
                ans = i;

            }

        }

        System.out.println(ans);
    }

}
