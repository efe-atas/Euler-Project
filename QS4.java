public class QS4 {
    public static void main(String[] args) {
        int x;
        int y;
        int c;
        int biggest = 0;

        for (x = 100; x <= 999; x++) {
            for (y = 999; y > 100; y--) {

                c = (x * y);
                int q = Integer.parseInt(new StringBuffer(String.valueOf(c)).reverse().toString());

                if (c == q) {

                    while (x * y > biggest) {

                        biggest = x * y;

                    }

                }

            }

        }
        System.out.println("Largest Palindrome is " + biggest);

    }

}
