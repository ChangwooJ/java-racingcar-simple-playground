package racingcar.util;

import java.util.Random;

public class RandomNumberGenerator implements NumberGenerator {
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 10;

    @Override
    public int generateRandomNumber() {
        return new Random().nextInt(MIN_NUMBER, MAX_NUMBER);
    }
}
