import java.lang.Math;

public class QS9 {
    public static void main(String[] args) {

        int a;
        int b;
        int c;

        for (c = 3; c < 1000; c++) {
            for (b = 2; b < c; b++) {
                for (a = 1; a < b; a++) {
                    if ((a + b + c) == 1000 && (Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2)) {
                        System.out.println(a * b * c);

                    }
                }

            }
        }

    }

}
