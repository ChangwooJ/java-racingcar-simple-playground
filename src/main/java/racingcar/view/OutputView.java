package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.CarList;

import java.util.ArrayList;
import java.util.List;

public class OutputView {
    public static void printNameInfo() {
        System.out.println("자동차의 이름을 입력해주세요: ");
    }

    public static void printWinners(List<Car> winners) {
        List<String> winnerNames = new ArrayList<>();

        for (Car car : winners) {
            winnerNames.add(car.getName());
        }

        System.out.print("우승자: " + String.join(", ", winnerNames));
    }

    public static void printCarPositions(CarList carList) {
        for (Car car : carList.getCarList()) {
            System.out.println(car.getName() + ": " + car.getPosition());
        }
    }
}
