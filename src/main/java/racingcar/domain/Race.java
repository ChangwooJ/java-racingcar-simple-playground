package racingcar.domain;

import racingcar.util.NumberGenerator;

public class Race {
    private static final int MOVE_THRESHOLD = 4;

    private NumberGenerator randomNumberGenerator;

    public Race(NumberGenerator randomNumberGenerator) {
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public void playRound(Car car) {
        int randomNumber = randomNumberGenerator.generateRandomNumber();
        if (randomNumber >= MOVE_THRESHOLD) {
            car.move();
        }
    }
}
