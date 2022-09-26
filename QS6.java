public class QS6 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int sums = 0;

        for (i = 1; i <= 100; i++) {
            sum += i;
            sums += square(i);

        }

        System.out.println(square(sum) - sums);

    }

    static int square(int x) {

        return x * x;

    }

}
