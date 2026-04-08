package racingcar.domain;

import racingcar.util.NumberGenerator;

import java.util.List;
import java.util.stream.Collectors;

public class CarList {

    private final List<Car> carList;

    public CarList(List<Car> carList) {
        this.carList = carList.stream().map(car -> new Car(car.getName(), car.getNumberGenerator())).collect(Collectors.toList());
    }

    public void playRoundAllCar() {
        for (Car car : carList) {
            car.playRound();
        }
    }

    public List<Car> getCarList() {
        return List.copyOf(carList);
    }
}
