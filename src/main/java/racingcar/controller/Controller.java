package racingcar.controller;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.Car;
import racingcar.domain.CarList;
import racingcar.util.RandomNumberGenerator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Controller {

    public void run() {
        int numberOfCars = InputView.inputNumberOfCars();
        List<Car> inputCarList = new ArrayList<>();
        inputAllCarName(numberOfCars, inputCarList);
        int totalRound = InputView.inputRoundNumber();

        CarList carList = new CarList(inputCarList);

        playRace(carList, totalRound);

        List<Car> winners = carList.findWinner();
        OutputView.printWinners(winners);
    }

    private void inputAllCarName(int numberOfCars, List<Car> inputCarList) {
        OutputView.printNameInfo();
        for (int i = 0; i < numberOfCars; i++) {
            String name = InputView.inputCarName();
            inputCarList.add(new Car(name));
        }
    }

    private void playRace(CarList carList, int totalRound) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        for (int i = 0; i < totalRound; i++) {
            carList.playRoundAllCar(randomNumberGenerator);
        }
    }
}
