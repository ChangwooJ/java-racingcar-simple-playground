package racingcar.domain;

import racingcar.util.NumberGenerator;

public class Car {

    private static final int MOVE_THRESHOLD = 4;
    private static final int MOVE_DISTANCE = 1;
    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public void playRound(NumberGenerator randomNumberGenerator) {
        int randomNumber = randomNumberGenerator.generateRandomNumber();
        if (randomNumber >= MOVE_THRESHOLD) {
            move();
        }
    }

    public void move() {
        position += MOVE_DISTANCE;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
