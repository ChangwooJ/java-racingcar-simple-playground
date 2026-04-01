package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class CarList {
    private final List<Car> carList;

    public CarList(List<Car> carList) {
        this.carList = carList;
    }

    public void playRoundAllCar(Race race) {
        for (Car car : carList) {
            race.playRound(car);
        }
    }

    public List<Car> findWinner() {
        int maxPosition = 0;
        for (Car car : carList) {
            int curPosition = car.getPosition();
            if (curPosition > maxPosition) {
                maxPosition = curPosition;
            }
        }

        List<Car> winners = new ArrayList<>();
        for (Car car : carList) {
            int curPosition = car.getPosition();
            if (curPosition == maxPosition) {
                winners.add(car);
            }
        }

        return winners;
    }
}
