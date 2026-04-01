package racingcar.util;

import java.util.Random;

public class RandomNumberGenerator {
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 10;

    public int generateRandomNumber() {
        return new Random().nextInt(MIN_NUMBER, MAX_NUMBER);
    }
}
