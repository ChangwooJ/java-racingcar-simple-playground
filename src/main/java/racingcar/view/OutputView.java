package racingcar.view;

import java.util.List;
import racingcar.domain.Car;

public class OutputView {

    public static void printNameInfo() {
        System.out.println("자동차의 이름을 입력해주세요: ");
    }

    public static void printWinners(List<Car> winners) {
        for (Car car : winners) {
            System.out.print("우승자: " + String.join(", ", car.getName()));
        }
    }
}
