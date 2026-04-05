package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Winners {

    private final List<Car> winners;

    public Winners(CarList winners) {
        this.winners = findWinners(winners);
    }

    private int MaxPosition(CarList carList) {
        int maxPosition = 0;
        for (Car car : carList.getCarList()) {
            int curPosition = car.getPosition();
            if (curPosition > maxPosition) {
                maxPosition = curPosition;
            }
        }
        return maxPosition;
    }

    private List<Car> findWinners(CarList carList) {
        int maxPosition = MaxPosition(carList);
        List<Car> result = new ArrayList<>();
        for (Car car : carList.getCarList()) {
            if (car.getPosition() == maxPosition) {
                result.add(car);
            }
        }
        return result;
    }

    public List<Car> getWinners() {
        return winners;
    }
}
