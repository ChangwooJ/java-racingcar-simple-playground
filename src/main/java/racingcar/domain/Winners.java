package racingcar.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Winners {

    private final List<Car> winners;

    public Winners(CarList winners) {
        this.winners = findWinners(winners);
    }

    private List<Car> findWinners(CarList carList) {
        int maxPosition = carList.getCarList().stream().mapToInt(Car::getPosition).max().orElse(0);
        return carList.getCarList().stream().filter(car -> car.getPosition() == maxPosition)
            .collect(Collectors.toList());
    }

    public List<Car> getWinners() {
        return winners;
    }
}
