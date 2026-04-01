package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.CarList;
import racingcar.domain.Race;
import racingcar.util.NumberGenerator;
import racingcar.util.RandomNumberGenerator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public void run() {
        int NumberOfCars = InputView.inputNumberOfCars();
        List<Car> inputCarList = new ArrayList<>();
        inputAllCarName(NumberOfCars, inputCarList);
        int totalRound = InputView.inputRoundNumber();

        CarList carList = new CarList(inputCarList);

        playRace(carList, totalRound);

        List<Car> winners = carList.findWinner();
        OutputView.printWinners(winners);
    }

    private void inputAllCarName(int NumberOfCars, List<Car> inputCarList) {
        OutputView.printNameInfo();
        for (int i = 0; i < NumberOfCars; i++) {
            String name = InputView.inputCarName();
            inputCarList.add(new Car(name));
        }
    }

    private void playRace(CarList carList, int totalRound) {
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        Race race = new Race(numberGenerator);

        for (int i = 0; i < totalRound; i++) {
            carList.playRoundAllCar(race);
        }
    }
}
