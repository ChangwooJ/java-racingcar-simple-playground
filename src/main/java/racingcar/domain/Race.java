package racingcar.domain;

import racingcar.util.RandomNumberGenerator;

public class Race {
    private static final int MOVE_THRESHOLD = 4;

    private RandomNumberGenerator randomNumberGenerator;

    public Race(RandomNumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public void playRound(Car car) {
        int randomNumber = randomNumberGenerator.generateRandomNumber();
        if (randomNumber >= MOVE_THRESHOLD) {
            car.move();
        }
    }
}
