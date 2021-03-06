package util;

import java.util.Random;

public class Generator {

    private static final Random random = new Random();

    private Generator() {
        throw new UnsupportedOperationException();
    }

    public static double[] generate(int N) {

        double[] in = new double[N];

        for (int i = 0; i < N; i++) {
            in[i] = random.nextDouble();
        }

        return in;
    }
}
